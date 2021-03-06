package com.saha.service;

import com.saha.annotations.ProdProfile;
import com.saha.models.model.User;
import com.saha.persistence.entity.UserEntity;
import com.saha.persistence.repository.UserRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import org.springframework.cache.annotation.Cacheable;

@Service
@ProdProfile
public class JpaUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DozerBeanMapper mapper;


    @Override
    public Collection<User> users() {
        Iterable<UserEntity> userEntities = userRepository.findAll();
        List<User> users = new ArrayList<>();
        for (UserEntity userEntity : userEntities) {
            User user = new User();
            mapper.map(userEntity, user);
            users.add(user);
        }
        return users;
    }

    @Override
    public  User findBy(String param) {
        Collection<UserEntity> userEntities= userRepository.findByLastName(param);

        userEntities.stream().forEach((userEntity) -> {
            System.out.println("userEntity = " + userEntity);
        });


        User user= new User();

        mapper.map(null,user);
        return user;
    }

    @Override
    @Cacheable("users")
    public User users(Long id) {
        UserEntity foundedUser = userRepository.findOne(id);
        User user = new User();
        mapper.map(foundedUser,user);
        return user;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = new UserEntity();
        mapper.map(user, userEntity);
        userEntity = userRepository.save(userEntity);

        User savedUser = new User();
        mapper.map(userEntity, savedUser);

        return savedUser;
    }

    @Override
    public Boolean delete(Long id) {
        userRepository.delete(id);
        return true;
    }

    @Override
    public User update(Long id, User user) {
        UserEntity foundedUser = userRepository.findOne(id);

        user.setTcKimlik(foundedUser.getId().toString());
        mapper.map(user,foundedUser);

        userRepository.save(foundedUser);

        mapper.map(foundedUser,user);

        return user;
    }
}
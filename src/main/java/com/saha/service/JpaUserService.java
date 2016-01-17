package com.saha.service;

import com.saha.annotations.ProdProfile;
import com.saha.model.User;
import com.saha.persistence.entity.UserEntity;
import com.saha.persistence.repository.UserRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public User users(Long id) {
        return null;
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
        return null;
    }

    @Override
    public User update(Long id, User user) {
        return null;
    }
}
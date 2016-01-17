package com.saha.persistence.repository;

import com.saha.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alper
 */
public interface UserRepository  extends CrudRepository<UserEntity,Long>{
    
}

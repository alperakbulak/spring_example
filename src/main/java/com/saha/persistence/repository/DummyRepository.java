package com.saha.persistence.repository;

import com.saha.persistence.entity.DummyEntity;
import com.saha.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface DummyRepository extends CrudRepository<DummyEntity, Long> {

}
package com.saha.persistence.repository;

import com.saha.persistence.entity.TweetEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Alper
 */
public interface TweetRepository  extends PagingAndSortingRepository<TweetEntity,Long>{
    
}

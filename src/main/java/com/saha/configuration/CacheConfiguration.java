package com.saha.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alper
 */
@Configuration
public class CacheConfiguration {
    @Bean
    public CacheManager cacheManager(){
        GuavaCacheManager guavaCacheManager = new GuavaCacheManager();
        return guavaCacheManager;
    }
}

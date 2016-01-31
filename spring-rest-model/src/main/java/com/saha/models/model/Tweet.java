package com.saha.models.model;
 
import org.dozer.Mapping;

/**
 * @author Alper
 */ 
public class Tweet {
    
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    private String  content;
    @Mapping("userEntity.id")
    private Long userId;
}

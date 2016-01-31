package com.saha.models.model;
 

/**
 * @author Alper
 */ 
public class TweetError {
    private Long code;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String description;
}

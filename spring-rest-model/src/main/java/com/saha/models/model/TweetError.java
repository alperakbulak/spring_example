package com.saha.models.model;

import lombok.Data;

/**
 * @author Alper
 */
@Data
public class TweetError {
    private Long code;
    private String description;
}

package com.saha.model;

import lombok.Data;

/**
 * @author Alper
 */
@Data
public class TweetError {
    private Long code;
    private String description;
}

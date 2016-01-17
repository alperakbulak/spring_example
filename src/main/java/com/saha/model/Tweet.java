package com.saha.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alper
 */
@Setter
@Getter
public class Tweet {
    private Long id;
    private String  content;
    private Long userId;
}

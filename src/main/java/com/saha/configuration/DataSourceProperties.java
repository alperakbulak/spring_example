package com.saha.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Alper
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
@Component
public class DataSourceProperties {
    private String url;
    private String username;
    private String password;
}
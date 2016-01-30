package com.saha.configuration;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alper
 */
@Configuration
public class DataSourceConfiguration {

    
    @Autowired
    private MyClassProperties myClassProperties;
    @Autowired
    private DataSourceProperties dataSourceProperties;
    
    @Bean
    public DataSource dataSource() throws SQLException {
        /*
         HikariDataSource dataSource = new HikariDataSource();
         dataSource.setLoginTimeout(10);
         dataSource.setUsername("postgres");
         dataSource.setPassword("1");
         dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
         dataSource.setConnectionTimeout(80000);
         return dataSource;
         */
        
        System.out.println("myClassProperties " + myClassProperties);
        
        
        return DataSourceBuilder.create()
                .url        (dataSourceProperties.getUrl()      )
                .username   (dataSourceProperties.getUsername() )
                .password   (dataSourceProperties.getPassword() )
                .build();

    }
}

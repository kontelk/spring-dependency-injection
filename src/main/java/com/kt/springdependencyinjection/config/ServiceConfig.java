package com.kt.springdependencyinjection.config;

import com.kt.springdependencyinjection.datasource.ExampleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kontelk on 8/20/23.
 */
@PropertySource(("classpath:datasource.properties"))
@ImportResource("classpath:sdi-config.xml")
@Configuration
public class ServiceConfig {

    @Bean
    ExampleDataSource exampleDataSource(@Value("${database.username}") String username,
                                        @Value("${database.password}") String password,
                                        @Value("${database.jdbcurl}") String jdbcurl) {
        ExampleDataSource exampleDataSource = new ExampleDataSource();
        exampleDataSource.setUsername(username);
        exampleDataSource.setPassword(password);
        exampleDataSource.setJdbcurl(jdbcurl);
        return exampleDataSource;
    }
}

package com.kt.springdependencyinjection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Created by kontelk on 8/20/23.
 */
@ConstructorBinding
@ConfigurationProperties("database")
public class SdiConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;

    public SdiConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}

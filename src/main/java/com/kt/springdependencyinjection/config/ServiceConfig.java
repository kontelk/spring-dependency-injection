package com.kt.springdependencyinjection.config;

import com.kt.springdependencyinjection.datasource.ExampleDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kontelk on 8/20/23.
 */
//@PropertySource(("classpath:datasource.properties"))    // <-- Spring Boot does that for us automaticaly
//@ImportResource("classpath:sdi-config.xml")             //     the same with this file
@EnableConfigurationProperties(SdiConstructorConfig.class)
@Configuration
public class ServiceConfig {

//    @Bean    // this uses property binding   (older practice)
//    ExampleDataSource exampleDataSource(SdiConfiguration sdiConfiguration) {
//        ExampleDataSource exampleDataSource = new ExampleDataSource();
//        exampleDataSource.setUsername(sdiConfiguration.getUsername());
//        exampleDataSource.setPassword(sdiConfiguration.getPassword());
//        exampleDataSource.setJdbcurl(sdiConfiguration.getJdbcurl());
//        return exampleDataSource;
//    }

    @Bean    // this uses constructor binding -  is better practice and more secure
    ExampleDataSource exampleDataSource(SdiConstructorConfig sdiConstructorConfig) {
        ExampleDataSource exampleDataSource = new ExampleDataSource();
        exampleDataSource.setUsername(sdiConstructorConfig.getUsername());
        exampleDataSource.setPassword(sdiConstructorConfig.getPassword());
        exampleDataSource.setJdbcurl(sdiConstructorConfig.getJdbcurl());
        return exampleDataSource;
    }
}

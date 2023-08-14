package com.kt.springdependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by kontelk on 8/14/23.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - ConstructorInjected";
    }
}

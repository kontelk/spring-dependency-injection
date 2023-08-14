package com.kt.springdependencyinjection.services;

/**
 * Created by kontelk on 8/14/23.
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

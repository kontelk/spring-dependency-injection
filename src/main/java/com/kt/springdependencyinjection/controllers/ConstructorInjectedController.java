package com.kt.springdependencyinjection.controllers;

import com.kt.springdependencyinjection.services.GreetingService;

/**
 * Created by kontelk on 8/14/23.
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

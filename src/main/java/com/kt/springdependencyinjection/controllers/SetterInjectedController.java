package com.kt.springdependencyinjection.controllers;

import com.kt.springdependencyinjection.services.GreetingService;

/**
 * Created by kontelk on 8/14/23.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

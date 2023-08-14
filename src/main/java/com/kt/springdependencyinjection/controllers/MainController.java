package com.kt.springdependencyinjection.controllers;

import com.kt.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by kontelk on 8/14/23.
 */
@Controller
public class MainController {

    private final GreetingService greetingService;

    //@Autowired                // @Autowired not needed on Constructor
    public MainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

package com.kt.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by kontelk on 8/14/23.
 */
@Controller
public class MainController {

    public String sayHello() {
        return "hello";
    }
}

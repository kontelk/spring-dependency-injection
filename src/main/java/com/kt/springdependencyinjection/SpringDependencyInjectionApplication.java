package com.kt.springdependencyinjection;

import com.kt.springdependencyinjection.controllers.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        MainController mainController = (MainController) ctx.getBean("mainController");
        String greeting = mainController.sayHello();
        System.out.println(greeting);
    }
}

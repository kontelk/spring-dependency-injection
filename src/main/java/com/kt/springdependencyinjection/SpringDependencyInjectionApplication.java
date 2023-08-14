package com.kt.springdependencyinjection;

import com.kt.springdependencyinjection.controllers.ConstructorInjectedController;
import com.kt.springdependencyinjection.controllers.MainController;
import com.kt.springdependencyinjection.controllers.PropertyInjectedController;
import com.kt.springdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        // SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        System.out.println("----------MainController----------");
        MainController mainController = (MainController) ctx.getBean("mainController");
        System.out.println(mainController.sayHello());

        System.out.println("----------PropertyInjectedController----------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------SetterInjectedController----------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------ConstructorInjectedController----------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}

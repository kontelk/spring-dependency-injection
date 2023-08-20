package com.kt.springdependencyinjection;

import com.kt.springdependencyinjection.config.SdiConfiguration;
import com.kt.springdependencyinjection.config.SdiConstructorConfig;
import com.kt.springdependencyinjection.controllers.*;
import com.kt.springdependencyinjection.datasource.ExampleDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.kt.springdependencyinjection", "com.kt.extrapackage"})
@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        // SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        MainController mainController = (MainController) ctx.getBean("mainController");

        System.out.println("----------Primary Bean----------");
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

        System.out.println("----------I18nController----------");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        System.out.println("----------ExampleDataSource----------");
        ExampleDataSource exampleDataSource = ctx.getBean("exampleDataSource" ,ExampleDataSource.class);
        System.out.println(exampleDataSource.getUsername());
        System.out.println(exampleDataSource.getPassword());
        System.out.println(exampleDataSource.getJdbcurl());

        System.out.println("----------- Config Props Binding -----------");
        SdiConfiguration sdiConfiguration = ctx.getBean(SdiConfiguration.class);
        System.out.println(sdiConfiguration.getUsername());
        System.out.println(sdiConfiguration.getPassword());
        System.out.println(sdiConfiguration.getJdbcurl());

        System.out.println("----------- Config Contructor Binding -----------");
        SdiConstructorConfig sdiConstructorConfig = ctx.getBean(SdiConstructorConfig.class);
        System.out.println(sdiConstructorConfig.getUsername());
        System.out.println(sdiConstructorConfig.getPassword());
        System.out.println(sdiConstructorConfig.getJdbcurl());


    }
}

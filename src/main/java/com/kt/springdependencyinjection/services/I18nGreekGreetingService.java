package com.kt.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by kontelk on 8/15/23.
 */
@Profile("gr")
@Service("i18nService")
public class I18nGreekGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Γεια σου κόσμε - GR";
    }
}

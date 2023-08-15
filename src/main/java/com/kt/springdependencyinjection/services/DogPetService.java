package com.kt.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by kontelk on 8/15/23.
 */
@Service("petService")
@Profile({"dog", "default"})
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}


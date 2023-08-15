package com.kt.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by kontelk on 8/15/23.
 */
@Service("petService")
@Profile("cat")
public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}

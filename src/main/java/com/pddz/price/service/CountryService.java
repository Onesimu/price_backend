package com.pddz.price.service;

import com.pddz.price.entity.Country;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RepositoryEventHandler(Country.class)
public class CountryService {
    @HandleBeforeSave
    public void handleCountrySave(Country p) {
//        if (p.getCountryId() == null) {
//            p.setCountryId(UUID.randomUUID());
//            System.out.println("li");
//        }
//        System.out.println("wai");
    }

    @HandleBeforeCreate
    public void handleCountryCreate(Country p) {
        if (p.getCountryId() == null) {
            p.setCountryId(UUID.randomUUID().toString());
        }
    }

    @HandleBeforeDelete
    public void handleCountryDelete(Country p) {
        // … you can now deal with Country in a type-safe way
    }
}

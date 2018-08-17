package com.pddz.price.service;

import com.pddz.price.entity.Carrier;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RepositoryEventHandler(Carrier.class)
public class CarrierService {

    @HandleBeforeSave
    public void handleCountrySave(Carrier p) {
//        p.setCarrierId(new String(p.getCarrierId()));
    }

    @HandleBeforeCreate
    public void handleCountryCreate(Carrier p) {
        if (p.getCarrierId() == null) {
            p.setCarrierId(UUID.randomUUID().toString());
        }
    }

    @HandleBeforeDelete
    public void handleCountryDelete(Carrier p) {
        // … you can now deal with Country in a type-safe way
    }

}
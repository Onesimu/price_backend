package com.pddz.price.service;

import com.pddz.price.entity.Seaexpressprice;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Service;

@Service
@RepositoryEventHandler(Seaexpressprice.class)
public class SeaexpresspriceService {

    @HandleBeforeSave
    public void handleCountrySave(Seaexpressprice p) {
//        p.setSeaexpresspriceId(new String(p.getSeaexpresspriceId()));
    }

    @HandleBeforeCreate
    public void handleCountryCreate(Seaexpressprice p) {
        if (p.getSePriceId() == null) {
//            p.setSePriceId(UUID.randomUUID().toString());
            p.setSePriceId(String.valueOf(System.nanoTime()));
        }
    }

    @HandleBeforeDelete
    public void handleCountryDelete(Seaexpressprice p) {
        // … you can now deal with Country in a type-safe way
    }

}
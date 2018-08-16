package com.pddz.price.service;

import com.pddz.price.entity.Port;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RepositoryEventHandler(Port.class)
public class PortService {

    @HandleBeforeSave
    public void handleCountrySave(Port p) {
//        p.setPortId(new String(p.getPortId()));
    }

    @HandleBeforeCreate
    public void handleCountryCreate(Port p) {
        if (p.getPortId() == null) {
            p.setPortId(UUID.randomUUID().toString());
        }
    }

    @HandleBeforeDelete
    public void handleCountryDelete(Port p) {
        // … you can now deal with Country in a type-safe way
    }

}

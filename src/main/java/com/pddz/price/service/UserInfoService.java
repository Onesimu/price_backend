package com.pddz.price.service;

import com.pddz.price.entity.Carrier;
import com.pddz.price.entity.Userinfo;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RepositoryEventHandler(Carrier.class)
public class UserInfoService {

    @HandleBeforeSave
    public void handleCountrySave(Userinfo p) {
//        p.setUserinfoId(new String(p.getUserinfoId()));
    }

    @HandleBeforeCreate
    public void handleCountryCreate(Userinfo p) {
        if (p.getStaffId() == null) {
            p.setStaffId(UUID.randomUUID().toString());
        }
    }

    @HandleBeforeDelete
    public void handleCountryDelete(Userinfo p) {
        // … you can now deal with Country in a type-safe way
    }

}

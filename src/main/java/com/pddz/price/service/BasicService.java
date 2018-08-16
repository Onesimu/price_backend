package com.pddz.price.service;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Service;

@Service
public class BasicService extends AbstractRepositoryEventListener {

    @Override
    public void onBeforeCreate(Object entity) {

    }

    @Override
    public void onBeforeSave(Object entity) {
//    ... logic to handle inspecting the entity before the Repository saves it
    }

    @Override
    public void onAfterDelete(Object entity) {
//    ... send a message that this entity has been deleted
    }

}

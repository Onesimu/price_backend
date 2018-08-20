package com.pddz.price.service;

import com.pddz.price.PriceApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Service;

@Service
public class BasicService extends AbstractRepositoryEventListener {

    private static final Logger logger = LoggerFactory.getLogger(PriceApplication.class);
    @Override
    public void onBeforeCreate(Object entity) {

    }

    @Override
    public void onBeforeSave(Object entity) {
//    ... logic to handle inspecting the entity before the Repository saves it
//        logger.info("修改前:"+ entity);
    }

    @Override
    public void onAfterCreate(Object entity){
        logger.info("新增:"+ entity);
    }

    @Override
    public void onAfterSave(Object entity){
        logger.info("修改:"+ entity);
    }

    @Override
    public void onAfterDelete(Object entity) {
//    ... send a message that this entity has been deleted
        logger.info("删除:"+ entity);
    }

}

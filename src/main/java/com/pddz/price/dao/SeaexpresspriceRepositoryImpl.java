package com.pddz.price.dao;

import com.pddz.price.entity.Seaexpressprice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RepositoryRestResource(path = "price")
//@RepositoryRestController
@BasePathAwareController
public class SeaexpresspriceRepositoryImpl {

    @Autowired
    private SeaexpresspriceRepository seaexpresspriceRepository;

//    @RestResource(path = "find")
    @RequestMapping("price")
    public Iterable<Seaexpressprice> findByExample() {
//    public List<Seaexpressprice> findByExample(Seaexpressprice seaexpressprice) {
        System.out.println("enter");
        List<Seaexpressprice> all = seaexpresspriceRepository.findAll();
        System.out.println(all);
        return all;
    }
}

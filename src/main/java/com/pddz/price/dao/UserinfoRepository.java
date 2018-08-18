package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.Userinfo;

public interface UserinfoRepository extends JpaRepository<Userinfo, String> {
    Userinfo findByStaffNameAndPassword(String staffName, String password);
}

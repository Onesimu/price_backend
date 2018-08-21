package com.pddz.price.dao;

import com.pddz.price.entity.Userinfo;

public interface UserinfoRepository extends BaseRepository<Userinfo, String> {
    Userinfo findByStaffNameAndPassword(String staffName, String password);
}

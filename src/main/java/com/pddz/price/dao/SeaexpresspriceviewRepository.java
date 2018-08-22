package com.pddz.price.dao;

import com.pddz.price.entity.Seaexpresspriceview;

import java.util.List;

public interface SeaexpresspriceviewRepository extends BaseRepository<Seaexpresspriceview, Integer> {
    List<Seaexpresspriceview> findAllByRouteLinePortLoadIdAndRouteLinePortDischargeId(String routeLinePortLoadId, String routeLinePortDischargeId);
}

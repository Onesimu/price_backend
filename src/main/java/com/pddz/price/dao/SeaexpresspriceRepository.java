package com.pddz.price.dao;

import com.pddz.price.entity.Seaexpressprice;

import java.util.List;

public interface SeaexpresspriceRepository extends BaseRepository<Seaexpressprice, String> {
 List<Seaexpressprice> findAllByRouteLinePortLoadIdAndRouteLinePortDischargeId(String routeLinePortLoadId, String routeLinePortDischargeId);
}

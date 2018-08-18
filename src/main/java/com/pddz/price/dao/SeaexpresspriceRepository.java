package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.Seaexpressprice;

import java.util.List;

public interface SeaexpresspriceRepository extends JpaRepository<Seaexpressprice, String> {
 List<Seaexpressprice> findAllByRouteLinePortLoadIdAndRouteLinePortDischargeId(String routeLinePortLoadId, String routeLinePortDischargeId);
}

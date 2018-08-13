package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.TdCarrier;

public interface TdCarrierRepository extends JpaRepository<TdCarrier, Integer> {
}

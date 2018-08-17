package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.Carrier;

public interface CarrierRepository extends JpaRepository<Carrier, String> {
}

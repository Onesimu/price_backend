package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.Port;

public interface PortRepository extends JpaRepository<Port, Integer> {
}

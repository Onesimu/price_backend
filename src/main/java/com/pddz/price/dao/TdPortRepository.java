package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.TdPort;

public interface TdPortRepository extends JpaRepository<TdPort, Integer> {
}

package com.pddz.price.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pddz.price.entity.TdCountry;

public interface TdCountryRepository extends JpaRepository<TdCountry, Integer> {
}

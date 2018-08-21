package com.pddz.price.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends Repository<T, ID> {

    Optional<T> findById(ID var1);

    Iterable<T> findAll();

    Page<T> findAll(Pageable var1);

    <S extends T> S save(S var1);

    void deleteById(ID var1);

}
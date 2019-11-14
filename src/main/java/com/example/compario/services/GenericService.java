package com.example.compario.services;


import com.example.compario.models.Value;

import java.util.List;

public interface GenericService<T extends Value> {
    List<T> findAll();

    T save(T entity);

    T findById(String id);

    void delete(T entity);

    void deleteById(String id);

    long count();
}

package com.example.compario.services;

import com.example.compario.repositories.GenericValueRepository;

public abstract class GenericService<T> {

    public abstract GenericValueRepository<T> getRepository();

    public Iterable<T> findAll() {

        return getRepository().findAll();
    }

    public T save(T entity) {

        return getRepository().save(entity);
    }
}

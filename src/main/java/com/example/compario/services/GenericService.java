package com.example.compario.services;

import com.example.compario.repositories.GenericValueRepository;
import org.springframework.data.domain.Example;

import java.util.Optional;

public abstract class GenericService<T> {

    public abstract GenericValueRepository<T> getRepository();

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public T save(T entity) {
        //TODO check if entity.description exist, else save()...
        Optional<T> one = getRepository().findOne(Example.of(entity));


        return getRepository().save(entity);
    }

    public void delete(String id) {
        Optional<T> toRemove = getRepository().findById(id);
        getRepository().delete((T) toRemove);
    }
}

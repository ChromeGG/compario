package com.example.compario.services;

import com.example.compario.models.Value;
import com.example.compario.repositories.GenericValueRepository;

import java.util.Optional;

public abstract class GenericService<T extends Value> {

    public abstract GenericValueRepository<T> getRepository();

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public T save(T entity) {
        //TODO check if entity.description exist, else save()...
        Optional<T> byDescription = getRepository().findByDescription(entity);

//        if (entity.getDescription().equals(byDescription.get().getDescription())) {
//            throw new RuntimeException(byDescription.get().toString() + " descriptions are the same");
//        } else {
//            return getRepository().save(entity);
//        }

        return getRepository().save(entity);
    }

    public void delete(String id) {
        Optional<T> toRemove = getRepository().findById(id);

        //TODO fix optional.get
        getRepository().delete(toRemove.get());
    }
}

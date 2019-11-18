package com.example.compario.services;

import com.example.compario.models.Value;
import com.example.compario.repositories.GenericValueRepository;

import java.util.Optional;

public abstract class GenericService<T extends Value> {

    public abstract GenericValueRepository<T> getRepository();

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public Optional<T> findByDescription(String decription) {
        return getRepository().findByDescription(decription);
    }

    public void save(T entity) {
        Optional<T> valueWithTheSameDescription = getRepository().findByDescription(entity.getDescription());

        if (valueWithTheSameDescription.isEmpty()) {
            getRepository().save(entity);
        } else {
            throw new RuntimeException(valueWithTheSameDescription.get().toString() + " descriptions are the same");
        }
    }

    public void delete(String id) {
        Optional<T> toRemove = getRepository().findById(id);

        //TODO fix optional.get
        getRepository().delete(toRemove.get());
    }
}

package com.example.compario.services;

import com.example.compario.models.Value;
import com.example.compario.repositories.GenericValueRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public abstract class GenericService<T extends Value> {

    public abstract GenericValueRepository<T> getRepository();

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public Optional<T> findByDescription(String description) {
        return getRepository().findByDescription(description);
    }

    public void save(T entity) {
        Optional<T> valueWithTheSameDescription = getRepository().findByDescription(entity.getDescription());

        if (valueWithTheSameDescription.isEmpty()) {
            getRepository().save(entity);
        } else {
            throw new RuntimeException(valueWithTheSameDescription.get().toString() + " descriptions are the same");
        }
    }

    public void deleteByID(String id) {
        GenericValueRepository<T> repository = getRepository();
        Optional<T> byId = repository.findById(id);

        if (byId.isPresent()) {
            repository.delete(byId.get());
        } else {
            throw new RuntimeException(" descriptions are the same");
        }

    }

    public List<T> findByValue(BigDecimal bigDecimal) {
        return getRepository().findByValue(bigDecimal.toString());
    }
}

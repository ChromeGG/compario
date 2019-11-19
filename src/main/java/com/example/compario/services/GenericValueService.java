package com.example.compario.services;

import com.example.compario.models.Value;
import com.example.compario.repositories.GenericValueRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public abstract class GenericValueService<T extends Value> {

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
            throw new RuntimeException("Can't save object " + valueWithTheSameDescription.get().toString() + ", saving filed.");
        }
    }

    public void deleteByID(String id) {
        GenericValueRepository<T> repository = getRepository();
        Optional<T> byId = repository.findById(id);

        if (byId.isPresent()) {
            repository.delete(byId.get());
        } else {
            throw new RuntimeException("Can't find object with id like " + id);
        }

    }

    public List<T> findByValue(BigDecimal bigDecimal) {
        return getRepository().findByValue(bigDecimal.toString());
    }

    public void update(T newValue) {
        GenericValueRepository<T> repository = getRepository();
        Optional<T> valueFromRepo = repository.findById(newValue.getId());

        //FIXME maybe short way?
        if (valueFromRepo.isPresent()) {
            valueFromRepo.map(old -> {
                old.setId(newValue.getId());
                old.setDescription(newValue.getDescription());
                old.setValue(newValue.getValue());
                old.setVotes(newValue.getVotes());
                old.setCreatedDate(newValue.getCreatedDate());
                return repository.save(old);
            });
        } else {
            throw new RuntimeException("Can't update object " + newValue.toString());
        }
    }
}

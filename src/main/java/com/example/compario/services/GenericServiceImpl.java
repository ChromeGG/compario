package com.example.compario.services;

import com.example.compario.models.Value;
import com.example.compario.repositories.GenericValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GenericServiceImpl<T extends Value> implements GenericService<T> {

    @Autowired
    private GenericValueRepository<T> dao;

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public T save(T entity) {
        return dao.save(entity);
    }

    public T findById(String id) {
        //TODO refactor to ifPresentMethod()
        return dao.findById(id).get();
    }

    @Override
    public void delete(T entity) {
        dao.delete(entity);
    }

    @Override
    public void deleteById(String id) {
        dao.deleteById(id);
    }

    @Override
    public long count() {
        return dao.count();
    }
}

package com.example.compario.services;

import com.example.compario.model.Value;
import com.example.compario.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueService {

    private ValueRepository valueRepo;

    @Autowired
    public ValueService(ValueRepository valueRepo) {
        this.valueRepo = valueRepo;
    }

    public Value create(String description, int value) {
        return valueRepo.save(new Value(value, description));
    }

    public List<Value> getAll() {
        return valueRepo.findAll();
    }
}

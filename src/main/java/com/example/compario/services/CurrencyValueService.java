package com.example.compario.services;

import com.example.compario.model.CurrencyValue;
import com.example.compario.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyValueService {

    private ValueRepository valueRepo;

    @Autowired
    public CurrencyValueService(ValueRepository valueRepo) {
        this.valueRepo = valueRepo;
    }

    public CurrencyValue create(String description, int value) {
        return valueRepo.save(new CurrencyValue(description, value));
    }

    public List<CurrencyValue> getAll() {
        return valueRepo.findAll();
    }
}

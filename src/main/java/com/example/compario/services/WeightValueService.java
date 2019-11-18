package com.example.compario.services;

import com.example.compario.models.WeightValue;
import com.example.compario.repositories.GenericValueRepository;
import com.example.compario.repositories.WeightValueRepository;
import org.springframework.stereotype.Service;

@Service
public class WeightValueService extends GenericService<WeightValue> {

    private final WeightValueRepository weightValueRepository;

    public WeightValueService(WeightValueRepository weightValueRepository) {
        this.weightValueRepository = weightValueRepository;
    }

    @Override
    public GenericValueRepository<WeightValue> getRepository() {
        return weightValueRepository;
    }
}

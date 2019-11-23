package com.example.compario.services;

import com.example.compario.models.WeightValue;
import com.example.compario.repositories.GenericValueRepository;
import com.example.compario.repositories.WeightValueRepository;
import org.springframework.stereotype.Service;

@Service
public class WeightValueValueService extends GenericValueService<WeightValue> {

    private final WeightValueRepository weightValueRepository;

    public WeightValueValueService(WeightValueRepository weightValueRepository) {
        this.weightValueRepository = weightValueRepository;
    }

    @Override
    public GenericValueRepository<WeightValue> getRepository() {
        return weightValueRepository;
    }
}

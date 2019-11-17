package com.example.compario.services;

import com.example.compario.models.SpeedValue;
import com.example.compario.repositories.GenericValueRepository;
import com.example.compario.repositories.SpeedValueRepository;
import org.springframework.stereotype.Service;

@Service
public class SpeedValueService extends GenericService<SpeedValue> {

    private final SpeedValueRepository speedValueRepository;

    public SpeedValueService(SpeedValueRepository speedValueRepository) {
        this.speedValueRepository = speedValueRepository;
    }

    @Override
    public GenericValueRepository<SpeedValue> getRepository() {
        return speedValueRepository;
    }
}

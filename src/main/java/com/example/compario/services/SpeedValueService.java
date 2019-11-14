package com.example.compario.services;

import com.example.compario.models.SpeedValue;
import com.example.compario.repositories.SpeedValueRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("speedValueService")
public class SpeedValueService extends GenericServiceImpl<SpeedValue> {


    public SpeedValueService(@Qualifier("speedValueRepository") SpeedValueRepository dao) {
        super(dao);
    }
}

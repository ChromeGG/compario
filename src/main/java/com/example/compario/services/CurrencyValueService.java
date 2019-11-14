package com.example.compario.services;

import com.example.compario.models.CurrencyValue;
import com.example.compario.repositories.CurrencyValueRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("currencyValueService")
public class CurrencyValueService extends GenericServiceImpl<CurrencyValue> {

    public CurrencyValueService(@Qualifier("currencyValueRepository") CurrencyValueRepository dao) {
        super(dao);
    }

//    public SpeedValueService(@Qualifier("speedValueRepository") GenericValueRepository<SpeedValue> dao) {
//        super(dao);
//    }
}

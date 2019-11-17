package com.example.compario.services;

import com.example.compario.models.CurrencyValue;
import com.example.compario.repositories.CurrencyValueRepository;
import com.example.compario.repositories.GenericValueRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyValueService extends GenericService<CurrencyValue> {

    private final CurrencyValueRepository currencyValueRepository;

    public CurrencyValueService(CurrencyValueRepository currencyValueRepository) {
        this.currencyValueRepository = currencyValueRepository;
    }

    @Override
    public GenericValueRepository<CurrencyValue> getRepository() {
        return currencyValueRepository;
    }
}

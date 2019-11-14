package com.example.compario.repositories;

import com.example.compario.models.CurrencyValue;
import org.springframework.stereotype.Repository;

@Repository("currencyValueRepository")
public interface CurrencyValueRepository extends GenericValueRepository<CurrencyValue> {
}

package com.example.compario.controllers.api.value;

import com.example.compario.models.CurrencyValue;
import com.example.compario.services.CurrencyValueValueService;
import com.example.compario.services.GenericValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/currencies")
public class CurrencyValueControllerREST extends GenericController<CurrencyValue> {

    private final CurrencyValueValueService currencyValueService;

    public CurrencyValueControllerREST(CurrencyValueValueService currencyValueService) {
        this.currencyValueService = currencyValueService;
    }

    @Override
    public GenericValueService<CurrencyValue> getService() {
        return currencyValueService;
    }

    @Override
    public CurrencyValue getNewInstanceOfT() {
        return new CurrencyValue();
    }

}

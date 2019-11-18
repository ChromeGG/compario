package com.example.compario.controllers.api.value;

import com.example.compario.models.CurrencyValue;
import com.example.compario.services.CurrencyValueService;
import com.example.compario.services.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/currencies")
public class CurrencyValueControllerREST extends GenericController<CurrencyValue> {

    private final CurrencyValueService currencyValueService;

    public CurrencyValueControllerREST(CurrencyValueService currencyValueService) {
        this.currencyValueService = currencyValueService;
    }

    @Override
    public GenericService<CurrencyValue> getService() {
        return currencyValueService;
    }

    @Override
    public CurrencyValue getNewInstanceOfT() {
        return new CurrencyValue();
    }

}

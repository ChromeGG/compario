package com.example.compario.controllers.api.value;

import com.example.compario.models.CurrencyValue;
import com.example.compario.services.CurrencyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/currencies")
public class CurrencyValueControllerREST extends GenericController<CurrencyValue> {

    @Autowired
    public CurrencyValueControllerREST(CurrencyValueService currencyValueService) {
        super(currencyValueService);
    }

//        @Autowired
//        public SpeedValueControllerREST(GenericServiceImpl<SpeedValue> speedValueService) {
//            super(speedValueService);
//        }

}

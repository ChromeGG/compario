package com.example.compario.controller.api.value;

import com.example.compario.model.CurrencyValue;
import com.example.compario.services.CurrencyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/values")
public class CurrencyValueControllerREST {

    private CurrencyValueService currencyValueService;

    @Autowired
    public CurrencyValueControllerREST(CurrencyValueService currencyValueService) {
        this.currencyValueService = currencyValueService;
    }

    @PostMapping
    public String create(@RequestParam String description, @RequestParam int value) {
        CurrencyValue v = currencyValueService.create(description, value);
        return "Added to DB: \n" + v.toString();
    }

    @GetMapping
    public List<CurrencyValue> getCurrencyValue() {
        return currencyValueService.getAll();
    }
}

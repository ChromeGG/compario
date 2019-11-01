package com.example.compario.controller.api.value;

import com.example.compario.model.CurrencyValue;
import com.example.compario.services.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/values/currencies")
public class CurrencyValueControllerREST {

    private ValueService currencyValueService;

    @Autowired
    public CurrencyValueControllerREST(ValueService currencyValueService) {
        this.currencyValueService = currencyValueService;
    }

    @PostMapping
    public String create(@RequestParam String description, @RequestParam int value) {
        CurrencyValue v = currencyValueService.create(description, value);
        return "Added to DB: \n" + v.toString();
    }

    @GetMapping
    public List getCurrencyValue() {
        return currencyValueService.getAll();
    }
}

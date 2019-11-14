package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public abstract class GenericController<T extends Value> {

    private GenericServiceImpl<T> service;

    public GenericController(GenericServiceImpl<T> valueService) {
        this.service = valueService;
    }

    @GetMapping
    public List<T> getCurrencyValue() {
        return service.findAll();
    }

    @PostMapping
    public String create(@RequestBody T json) {

        T created = this.service.save(json);
        return "Added to DB: \n" + created.toString();
    }
}

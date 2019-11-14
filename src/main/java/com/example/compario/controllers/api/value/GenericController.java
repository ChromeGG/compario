package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class GenericController<T extends Value> {

    private GenericServiceImpl<T> service;

    public GenericController(GenericServiceImpl<T> speedValueService) {
        this.service = speedValueService;
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


    //There should be something like
//    private S service;
//    private T value;
//    private Supplier<T> supplier;
//
//    public GenericController(S s, T t) {
//        this.service = s;
//        this.value = t;
//    }
//
//    @GetMapping
//    public List<T> getCurrencyValue() {
//        return service.getAll();
//    }
//
//
//    @PostMapping
//    public String create(@RequestParam String description, @RequestParam int value) {
//        T t = supplier.get();
//        t.setValue(value);
//        t.setDescription(description);
//        service.create(t);
//        return "Added to DB: \n" + t.toString();
//    }
    //
//    @GetMapping
//    public List getCurrencyValue() {
//        return speedValueService.getAll();
//    }
}

package com.example.compario.controller.api.value;

import com.example.compario.services.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/values/speed")
public class SpeedValueControllerREST {

    private ValueService speedValueService;

    @Autowired
    public SpeedValueControllerREST(ValueService speedValueService) {
        this.speedValueService = speedValueService;
    }

    @PostMapping
    public String create(@RequestParam String description, @RequestParam int value) {
        Object v = speedValueService.create(description, value);
        return "Added to DB: \n" + v.toString();
    }

    @GetMapping
    public List getCurrencyValue() {
        return speedValueService.getAll();
    }
}

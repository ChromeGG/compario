package com.example.compario.controllers.api.value;

import com.example.compario.models.SpeedValue;
import com.example.compario.services.SpeedValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/speed")
public class SpeedValueControllerREST extends GenericController<SpeedValue> {

    @Autowired
    public SpeedValueControllerREST(SpeedValueService speedValueService) {
        super(speedValueService);
    }


    //    @Autowired
//    public SpeedValueControllerREST(ValueService speedValueService) {
//        this.speedValueService = speedValueService;
//    }
//
//    @PostMapping
//    public String create(@RequestParam String description, @RequestParam int value) {
//        Object v = speedValueService.create(description, value);
//        return "Added to DB: \n" + v.toString();
//    }
//
//    @GetMapping
//    public List getCurrencyValue() {
//        return speedValueService.getAll();
//    }
}

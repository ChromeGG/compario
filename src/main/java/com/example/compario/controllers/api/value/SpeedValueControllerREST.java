package com.example.compario.controllers.api.value;

import com.example.compario.models.SpeedValue;
import com.example.compario.services.GenericValueService;
import com.example.compario.services.SpeedValueValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/speed")
public class SpeedValueControllerREST extends GenericController<SpeedValue> {

    private final SpeedValueValueService speedValueService;

    public SpeedValueControllerREST(SpeedValueValueService speedValueService) {
        this.speedValueService = speedValueService;
    }

    @Override
    public GenericValueService<SpeedValue> getService() {
        return speedValueService;
    }

    @Override
    public SpeedValue getNewInstanceOfT() {
        return new SpeedValue();
    }
}

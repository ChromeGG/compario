package com.example.compario.controllers.api.value;

import com.example.compario.models.SpeedValue;
import com.example.compario.services.GenericService;
import com.example.compario.services.SpeedValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/speed")
public class SpeedValueControllerREST extends GenericController<SpeedValue> {

    private final SpeedValueService speedValueService;

    public SpeedValueControllerREST(SpeedValueService speedValueService) {
        this.speedValueService = speedValueService;
    }

    @Override
    public GenericService<SpeedValue> getService() {
        return speedValueService;
    }
}

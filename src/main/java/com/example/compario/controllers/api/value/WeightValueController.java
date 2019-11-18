package com.example.compario.controllers.api.value;

import com.example.compario.models.WeightValue;
import com.example.compario.services.GenericService;
import com.example.compario.services.WeightValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/weight")
public class WeightValueController extends GenericController<WeightValue> {

    private final WeightValueService weightValueService;

    public WeightValueController(WeightValueService weightValueService) {
        this.weightValueService = weightValueService;
    }

    @Override
    public GenericService<WeightValue> getService() {
        return weightValueService;
    }

    @Override
    public WeightValue getNewInstanceOfT() {
        return new WeightValue();
    }
}

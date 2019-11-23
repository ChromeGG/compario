package com.example.compario.controllers.api.value;

import com.example.compario.models.WeightValue;
import com.example.compario.services.GenericValueService;
import com.example.compario.services.WeightValueValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/values/weight")
public class WeightValueController extends GenericController<WeightValue> {

    private final WeightValueValueService weightValueService;

    public WeightValueController(WeightValueValueService weightValueService) {
        this.weightValueService = weightValueService;
    }

    @Override
    public GenericValueService<WeightValue> getService() {
        return weightValueService;
    }

    @Override
    public WeightValue getNewInstanceOfT() {
        return new WeightValue();
    }
}

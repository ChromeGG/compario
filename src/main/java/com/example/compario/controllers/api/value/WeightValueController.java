package com.example.compario.controllers.api.value;

import com.example.compario.models.WeightValue;
import com.example.compario.services.GenericService;
import com.example.compario.services.WeightValueService;
import org.springframework.stereotype.Controller;

@Controller
public class WeightValueController extends GenericController<WeightValue> {

    private final WeightValueService weightValueService;

    public WeightValueController(WeightValueService weightValueService) {
        this.weightValueService = weightValueService;
    }

    @Override
    public GenericService<WeightValue> getService() {
        return weightValueService;
    }
}

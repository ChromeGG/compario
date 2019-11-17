package com.example.compario.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "speed_values")
public class SpeedValue extends Value {

    public SpeedValue(int value, String description) {
        super(value, description);
    }

}

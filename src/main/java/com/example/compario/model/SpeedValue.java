package com.example.compario.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor

@Document(collection = "speed_values")
public class SpeedValue extends Value {

    public SpeedValue(int value, String description) {
        super(value, description);
    }
}

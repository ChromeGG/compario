package com.example.compario.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)

@Document(collection = "speed_values")
public class SpeedValue extends Value {
}

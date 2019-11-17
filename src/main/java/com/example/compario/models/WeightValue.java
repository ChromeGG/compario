package com.example.compario.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data

@Document(collection = "weight_values")
public class WeightValue extends Value {
}

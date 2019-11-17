package com.example.compario.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data

@Document(collection = "currency_values")
public class CurrencyValue extends Value {
}

package com.example.compario.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor

@Document(collection = "currency_values")
public class CurrencyValue extends Value {

    public CurrencyValue(int value, String description) {
        super(value, description);
    }
}

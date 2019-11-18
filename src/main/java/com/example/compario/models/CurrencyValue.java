package com.example.compario.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor

@Document(collection = "currency_values")
public class CurrencyValue extends Value {

    public CurrencyValue(BigDecimal value, String description) {
        super(value, description);
    }
}

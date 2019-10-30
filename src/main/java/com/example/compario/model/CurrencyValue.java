package com.example.compario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor

@Document(collection = "currency_values")
public class CurrencyValue extends Value {

    public CurrencyValue(int value, String description) {
        super(value, description);
    }
}

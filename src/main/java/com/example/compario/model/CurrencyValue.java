package com.example.compario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
@NoArgsConstructor
public class CurrencyValue {

    @Id
    Long id;
    String description;
    Integer value;

    public CurrencyValue(String description, int value) {
        this.description = description;
        this.value = value;
    }
}

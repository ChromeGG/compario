package com.example.compario.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class Value {

    @Id
    Long id;
    String description;
    BigDecimal value;

}

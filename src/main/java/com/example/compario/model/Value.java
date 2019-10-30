package com.example.compario.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Value {

    @Id
    String id;
    String description;
    Integer value;

    public Value(int value, String description) {
        this.description = description;
        this.value = value;
    }
}

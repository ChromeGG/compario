package com.example.compario.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Value implements Serializable {

    @Id
    String id;
    String description;
    Integer value;

    public Value(int value, String description) {
        this.description = description;
        this.value = value;
    }
}

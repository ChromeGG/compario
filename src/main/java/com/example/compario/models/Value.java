package com.example.compario.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class Value implements Serializable {

    @Id
    String id;

    @NotNull
    String description;

    @NotNull
    Integer value;

    Value(int value, String description) {
        this.description = description;
        this.value = value;
    }
}

package com.example.compario.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Value extends RepresentationModel {

    @Id
    String id;

    @NotNull
    String description;

    @NotNull
    BigDecimal value;

    Long votes;

    String author;

    LocalDateTime createdDate;

    Value(BigDecimal value, String description) {
        this.description = description;
        this.value = value;
    }
}

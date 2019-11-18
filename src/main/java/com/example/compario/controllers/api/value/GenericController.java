package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public abstract class GenericController<T extends Value> {

    public abstract GenericService<T> getService();

    public abstract T getNewInstanceOfT();

    @GetMapping
    public ResponseEntity<Iterable<T>> findAll() {
        return ResponseEntity.ok(getService().findAll());
    }

    @PostMapping
    public ResponseEntity<String> saveWithOnlyValueAndDescription(@RequestParam(name = "description") String descriptionParam, @RequestParam(name = "value") String valueParam) {
        T entity = getNewInstanceOfT();

        entity.setDescription(descriptionParam);
        entity.setValue(new BigDecimal(valueParam));

        try {
            getService().save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(entity.toString());
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}

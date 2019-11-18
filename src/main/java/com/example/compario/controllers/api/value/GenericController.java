package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public abstract class GenericController<T extends Value> {

    public abstract GenericService<T> getService();

    public abstract T getNewInstanceOfT();

    @GetMapping
    public ResponseEntity<Iterable<T>> findAll() {
        return ResponseEntity.ok(getService().findAll());
    }

    @GetMapping(params = "value")
    public ResponseEntity<List<T>> findByValue(@RequestParam(name = "value") String value) {
        List<T> foundByDescription = getService().findByValue(new BigDecimal(value));

        if (!foundByDescription.isEmpty()) {
            return ResponseEntity.ok(foundByDescription);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //FIXME handle with description contains space character
    @GetMapping(params = "description")
    public ResponseEntity<T> findByDescription(@RequestParam(name = "description") String descriptionParam) {
        Optional<T> foundByDescription = getService().findByDescription(descriptionParam);
        if (foundByDescription.isPresent()) {
            return ResponseEntity.ok(foundByDescription.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<T> saveWithOnlyValueAndDescription(@RequestParam(name = "description") String descriptionParam, @RequestParam(name = "value") String valueParam) {
        T entity = getNewInstanceOfT();

        entity.setDescription(descriptionParam);
        entity.setValue(new BigDecimal(valueParam));

        try {
            getService().save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(entity);
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}

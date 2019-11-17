package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public abstract class GenericController<T extends Value> {

    public abstract GenericService<T> getService();

    @GetMapping
    public ResponseEntity<Iterable<T>> findAll() {

        return ResponseEntity.ok(getService().findAll());
    }

    @PostMapping
    public ResponseEntity<T> save(T entity) {

        return ResponseEntity.ok(getService().save(entity));
    }
}

package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericValueService;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

public abstract class GenericController<T extends Value> {

    public abstract GenericValueService<T> getService();

    public abstract T getNewInstanceOfT();

    @GetMapping
    public ResponseEntity<Iterable<T>> findAll() {

        return ResponseEntity.ok(getService().findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<T>> findById(@PathVariable String id) {
        Optional<T> byId = getService().findById(id);

        if (byId.isPresent()) {
            Link link = linkTo(getClass()).slash(byId.get().getId()).withSelfRel();
            EntityModel<T> entityModel = new EntityModel<>(byId.get(), link);
            return ResponseEntity.ok(entityModel);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
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

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable String id, @RequestBody T t) {
        try {
            getService().update(t, id);
            return ResponseEntity.ok(t);
        } catch (RuntimeException exception) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable String id) {
        try {
            getService().deleteByID(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

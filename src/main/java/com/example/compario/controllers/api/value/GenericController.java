package com.example.compario.controllers.api.value;


import com.example.compario.models.Value;
import com.example.compario.services.GenericService;
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
    public ResponseEntity<T> saveWithOnlyValueAndDescription(@RequestParam(name = "description") String descriptionParam, @RequestParam(name = "value") String valueParam) {
        T entity = getNewInstanceOfT();
        entity.setDescription(descriptionParam);
        entity.setValue(new BigDecimal(valueParam));
        return ResponseEntity.ok(getService().save(entity));
    }

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> saveCity(@RequestBody City city) {
//        if(!cities.contains(city)) {
//            cities.add(city);
//            URI location = ServletUriComponentsBuilder
//                    .fromCurrentRequest()
//                    .path("/{id}")
//                    .buildAndExpand(cities.size()-1)
//                    .toUri();
//            return ResponseEntity.created(location).body(city);
//        } else {
//            return ResponseEntity.status(HttpStatus.CONFLICT).build();
//        }
//    }
}

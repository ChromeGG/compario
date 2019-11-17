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

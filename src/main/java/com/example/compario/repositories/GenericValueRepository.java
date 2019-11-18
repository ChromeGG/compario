package com.example.compario.repositories;

import com.example.compario.models.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface GenericValueRepository<T extends Value> extends MongoRepository<T, String> {

    Optional<T> findByDescription(String description);

}

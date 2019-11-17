package com.example.compario.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericValueRepository<T> extends MongoRepository<T, String> {
}

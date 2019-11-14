package com.example.compario.repositories;

import com.example.compario.models.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
@Repository
public interface GenericValueRepository<T extends Value> extends MongoRepository<T, String> {
}

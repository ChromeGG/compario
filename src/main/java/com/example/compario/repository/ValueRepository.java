package com.example.compario.repository;

import com.example.compario.model.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepository extends MongoRepository<Value, String> {
}

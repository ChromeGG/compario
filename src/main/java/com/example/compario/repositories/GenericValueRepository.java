package com.example.compario.repositories;

import com.example.compario.models.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface GenericValueRepository<T extends Value> extends MongoRepository<T, String> {

    @Query("SELECT g "
            + "FROM " + "#{#entityName}" + " g "
            + "WHERE g.#{#entityName}description = ?1")
    Optional<T> findByDescription(T id);

}

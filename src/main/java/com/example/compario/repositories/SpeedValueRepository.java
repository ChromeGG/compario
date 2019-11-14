package com.example.compario.repositories;

import com.example.compario.models.SpeedValue;
import org.springframework.stereotype.Repository;

@Repository("speedValueRepository")
public interface SpeedValueRepository extends GenericValueRepository<SpeedValue> {
}

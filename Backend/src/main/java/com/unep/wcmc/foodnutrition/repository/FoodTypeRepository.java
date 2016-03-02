package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.FoodType;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/food-types")
public interface FoodTypeRepository extends AbstractRepository<FoodType> {
}

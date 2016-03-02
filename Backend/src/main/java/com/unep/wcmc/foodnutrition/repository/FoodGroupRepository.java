package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.FoodGroup;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/food-groups")
public interface FoodGroupRepository extends AbstractRepository<FoodGroup> {
}

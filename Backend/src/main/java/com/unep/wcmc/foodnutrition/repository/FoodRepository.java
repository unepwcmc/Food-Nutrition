package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.Food;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface FoodRepository extends AbstractRepository<Food> {
}
package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.Recipe;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface RecipeRepository extends AbstractRepository<Recipe> {
}

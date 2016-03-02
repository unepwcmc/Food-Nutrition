package com.unep.wcmc.foodnutrition.service;

import com.unep.wcmc.foodnutrition.model.Recipe;
import com.unep.wcmc.foodnutrition.repository.RecipeRepository;
import com.unep.wcmc.foodnutrition.support.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RecipeService extends AbstractService<Recipe, RecipeRepository> {
}

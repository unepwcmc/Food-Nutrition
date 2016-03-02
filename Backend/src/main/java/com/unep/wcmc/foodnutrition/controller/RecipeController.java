package com.unep.wcmc.foodnutrition.controller;

import com.unep.wcmc.foodnutrition.model.Recipe;
import com.unep.wcmc.foodnutrition.service.RecipeService;
import com.unep.wcmc.foodnutrition.support.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController extends AbstractController<Recipe, RecipeService> {
}

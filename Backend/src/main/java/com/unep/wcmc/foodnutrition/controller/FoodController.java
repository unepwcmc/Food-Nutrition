package com.unep.wcmc.foodnutrition.controller;

import com.unep.wcmc.foodnutrition.model.Food;
import com.unep.wcmc.foodnutrition.service.FoodService;
import com.unep.wcmc.foodnutrition.support.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foods")
public class FoodController extends AbstractController<Food, FoodService> {

}

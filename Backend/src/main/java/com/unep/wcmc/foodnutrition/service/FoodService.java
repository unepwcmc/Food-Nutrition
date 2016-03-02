package com.unep.wcmc.foodnutrition.service;

import com.unep.wcmc.foodnutrition.model.Food;
import com.unep.wcmc.foodnutrition.repository.FoodRepository;
import com.unep.wcmc.foodnutrition.support.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class FoodService extends AbstractService<Food, FoodRepository> {
}

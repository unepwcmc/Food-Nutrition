package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = FoodCharacteristic.FOOD_SIZE)
public class FoodSize extends FoodCharacteristic {
    // Empty
}
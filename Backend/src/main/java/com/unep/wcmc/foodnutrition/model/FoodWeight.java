package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = FoodCharacteristic.FOOD_WEIGHT)
public class FoodWeight extends FoodCharacteristic {
    // Empty
}
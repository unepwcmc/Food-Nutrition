package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = FoodCharacteristic.PH)
public class Ph extends FoodCharacteristic {
    // Empty
}
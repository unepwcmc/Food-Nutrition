package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = FoodCharacteristic.EDIBLE_PORTION)
public class EdiblePortion extends FoodCharacteristic {
    // Empty
}
package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = FoodCharacteristic.SOLID_SOLUBLE)
public class SolidSoluble extends FoodCharacteristic {
    // Empty
}
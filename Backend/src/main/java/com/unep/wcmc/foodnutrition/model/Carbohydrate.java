package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.CARBOHYDRATE)
public class Carbohydrate extends Nutrient {
    // Empty
}
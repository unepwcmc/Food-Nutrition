package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.STEROL)
public class Sterol extends Nutrient {
    // Empty
}

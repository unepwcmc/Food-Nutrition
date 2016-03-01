package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.BIOACTIVE_COMPUND)
public class BioactiveCompund extends Nutrient {
    // Empty
}

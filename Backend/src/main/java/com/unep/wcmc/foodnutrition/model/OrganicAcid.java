package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.ORGANIC_ACID)
public class OrganicAcid extends Nutrient {
    // Empty
}
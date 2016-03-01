package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.SUM_PROXIMATE)
public class SumProximate extends Nutrient {
    // Empty
}

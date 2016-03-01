package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NITROGEN")
public class Nitrogen extends Nutrient {
    // Empty
}
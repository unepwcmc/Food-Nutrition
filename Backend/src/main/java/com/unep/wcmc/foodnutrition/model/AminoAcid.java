package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(NutrientType.AMINO_ACID)
public class AminoAcid extends Nutrient {
    // Empty
}
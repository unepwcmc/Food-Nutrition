package com.unep.wcmc.foodnutrition.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Nutrient.AMINO_ACID)
public class AminoAcid extends Nutrient {
    // Empty
}
package com.unep.wcmc.foodnutrition.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(Nutrient.VITAMIN)
public class Vitamin extends Nutrient {
    // Empty
}

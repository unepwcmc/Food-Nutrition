package com.unep.wcmc.foodnutrition.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(FoodCharacteristic.DENSITY)
public class Density extends FoodCharacteristic {
    // Empty
}
package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;

@Entity
@Inheritance
@DiscriminatorColumn(name = "characteristic_type")
public abstract class FoodCharacteristic implements BaseEntity {

    static final String DENSITY = "DENSITY";
    static final String EDIBLE_PORTION = "EDIBLE_PORTION";
    static final String PH = "PH";
    static final String SOLID_SOLUBLE = "SOLID_SOLUBLE";
    static final String FOOD_SIZE = "FOOD_SIZE";
    static final String FOOD_WEIGHT = "FOOD_WEIGHT";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private MeasureUnit unit;

    private Float value;

    private Float minValue;

    private Float maxValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeasureUnit getUnit() {
        return unit;
    }

    public void setUnit(MeasureUnit unit) {
        this.unit = unit;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Float getMinValue() {
        return minValue;
    }

    public void setMinValue(Float minValue) {
        this.minValue = minValue;
    }

    public Float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Float maxValue) {
        this.maxValue = maxValue;
    }
}

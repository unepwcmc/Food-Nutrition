package com.unep.wcmc.foodnutrition.model;

public class Nutrient {

    private NutrientUnit unit;

    private Float value;

    private Float minValue;

    private Float maxValue;

    private Integer numStudies;

    public NutrientUnit getUnit() {
        return unit;
    }

    public void setUnit(NutrientUnit unit) {
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

    public Integer getNumStudies() {
        return numStudies;
    }

    public void setNumStudies(Integer numStudies) {
        this.numStudies = numStudies;
    }
}

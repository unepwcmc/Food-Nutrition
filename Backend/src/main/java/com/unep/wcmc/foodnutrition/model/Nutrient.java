package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;

@Entity
public class Nutrient implements BaseEntity, NutrientConstants {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MeasureUnit unit;

    private Float value;

    private Float minValue;

    private Float maxValue;

    private Integer numStudies;

    @ManyToOne
    @JoinColumn(name = "nutrient_type_id")
    private NutrientType nutrientType;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
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

    public Integer getNumStudies() {
        return numStudies;
    }

    public void setNumStudies(Integer numStudies) {
        this.numStudies = numStudies;
    }

    public NutrientType getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(NutrientType nutrientType) {
        this.nutrientType = nutrientType;
    }
}

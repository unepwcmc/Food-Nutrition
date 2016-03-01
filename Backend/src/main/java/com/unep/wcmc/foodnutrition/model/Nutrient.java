package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;

@Entity
@Inheritance
@DiscriminatorColumn(name = "nutrient_type")
public abstract class Nutrient implements BaseEntity {

    static final String ENERGY = "ENERGY";
    static final String WATER = "WATER";
    static final String ASH = "ASH";
    static final String PROTEIN = "PROTEIN";
    static final String AMINO_ACID = "AMINO_ACID";
    static final String LIPID = "LIPID";
    static final String CARBOHYDRATE = "CARBOHYDRATE";
    static final String VITAMIN = "VITAMIN";
    static final String MINERAL = "MINERAL";
    static final String ORGANIC_ACID = "ORGANIC_ACID";
    static final String STEROL = "STEROL";
    static final String BIOACTIVE_COMPUND = "BIOACTIVE_COMPUND";
    static final String SUM_PROXIMATE = "SUM_PROXIMATE";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private MeasureUnit unit;

    private Float value;

    private Float minValue;

    private Float maxValue;

    private Integer numStudies;

    private Nutrient parent;

    @Override
    public Long getId() {
        return id;
    }

    @Override
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

    public Integer getNumStudies() {
        return numStudies;
    }

    public void setNumStudies(Integer numStudies) {
        this.numStudies = numStudies;
    }

    public Nutrient getParent() {
        return parent;
    }

    public void setParent(Nutrient parent) {
        this.parent = parent;
    }
}

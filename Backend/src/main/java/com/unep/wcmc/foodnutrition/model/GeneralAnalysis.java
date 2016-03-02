package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;

@Entity
public class GeneralAnalysis implements BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "density_id")
    private Density density;

    @OneToOne
    @JoinColumn(name = "edible_portion_id")
    private EdiblePortion ediblePortion;

    @OneToOne
    @JoinColumn(name = "ph_id")
    private PH pH;

    @OneToOne
    @JoinColumn(name = "solid_soluble_id")
    private SolidSoluble solidSoluble;

    @OneToOne
    @JoinColumn(name = "food_size_id")
    private FoodSize foodSize;

    @OneToOne
    @JoinColumn(name = "food_weight_id")
    private FoodWeight foodWeight;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Density getDensity() {
        return density;
    }

    public void setDensity(Density density) {
        this.density = density;
    }

    public EdiblePortion getEdiblePortion() {
        return ediblePortion;
    }

    public void setEdiblePortion(EdiblePortion ediblePortion) {
        this.ediblePortion = ediblePortion;
    }

    public PH getpH() {
        return pH;
    }

    public void setpH(PH pH) {
        this.pH = pH;
    }

    public SolidSoluble getSolidSoluble() {
        return solidSoluble;
    }

    public void setSolidSoluble(SolidSoluble solidSoluble) {
        this.solidSoluble = solidSoluble;
    }

    public FoodSize getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(FoodSize foodSize) {
        this.foodSize = foodSize;
    }

    public FoodWeight getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(FoodWeight foodWeight) {
        this.foodWeight = foodWeight;
    }
}

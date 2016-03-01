package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;

@Entity
public class FoodNutrients implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "energy_id")
    private Energy energy;

    @OneToOne
    @JoinColumn(name = "sum_proximate_id")
    private SumProximate sumProximate;

    @OneToOne
    @JoinColumn(name = "water_id")
    private Water water;

    @OneToOne
    @JoinColumn(name = "ash_id")
    private Ash ash;

    @OneToOne
    @JoinColumn(name = "protein_id")
    private Protein protein;

    @OneToOne
    @JoinColumn(name = "lipid_id")
    private Lipid lipid;

    @OneToOne
    @JoinColumn(name = "carbohydrate_id")
    private Carbohydrate carbohydrate;

    @OneToOne
    @JoinColumn(name = "mineral_id")
    private Mineral mineral;

    @OneToOne
    @JoinColumn(name = "vitamin_id")
    private Vitamin vitamin;

    @OneToOne
    @JoinColumn(name = "bioactive_compund_id")
    private BioactiveCompund bioactiveCompund;

    @OneToOne
    @JoinColumn(name = "organic_acid_id")
    private OrganicAcid organicAcid;

    @OneToOne
    @JoinColumn(name = "sterol_id")
    private Sterol sterol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public SumProximate getSumProximate() {
        return sumProximate;
    }

    public void setSumProximate(SumProximate sumProximate) {
        this.sumProximate = sumProximate;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Ash getAsh() {
        return ash;
    }

    public void setAsh(Ash ash) {
        this.ash = ash;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Lipid getLipid() {
        return lipid;
    }

    public void setLipid(Lipid lipid) {
        this.lipid = lipid;
    }

    public Carbohydrate getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Carbohydrate carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    public BioactiveCompund getBioactiveCompund() {
        return bioactiveCompund;
    }

    public void setBioactiveCompund(BioactiveCompund bioactiveCompund) {
        this.bioactiveCompund = bioactiveCompund;
    }

    public OrganicAcid getOrganicAcid() {
        return organicAcid;
    }

    public void setOrganicAcid(OrganicAcid organicAcid) {
        this.organicAcid = organicAcid;
    }

    public Sterol getSterol() {
        return sterol;
    }

    public void setSterol(Sterol sterol) {
        this.sterol = sterol;
    }
}

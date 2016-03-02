package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeIngredient implements BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Integer quantityHousehold;

    private String householdMeasure;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityHousehold() {
        return quantityHousehold;
    }

    public void setQuantityHousehold(Integer quantityHousehold) {
        this.quantityHousehold = quantityHousehold;
    }

    public String getHouseholdMeasure() {
        return householdMeasure;
    }

    public void setHouseholdMeasure(String householdMeasure) {
        this.householdMeasure = householdMeasure;
    }
}

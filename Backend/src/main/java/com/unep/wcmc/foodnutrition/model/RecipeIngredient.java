package com.unep.wcmc.foodnutrition.model;

public class RecipeIngredient {

    private String name;

    private Integer quantity;

    private Integer quantityHousehold;

    private String householdMeasure;

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

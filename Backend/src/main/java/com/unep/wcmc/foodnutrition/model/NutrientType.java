package com.unep.wcmc.foodnutrition.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unep.wcmc.foodnutrition.repository.NutrientTypeProjection;
import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class NutrientType implements BaseEntity, NutrientTypeProjection {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MeasureUnit unit;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private NutrientType parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<NutrientType> children;

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

    public NutrientType getParent() {
        return parent;
    }

    public void setParent(NutrientType parent) {
        this.parent = parent;
    }

    public Set<NutrientType> getChildren() {
        return children;
    }

    public void setChildren(Set<NutrientType> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return name;
    }
}

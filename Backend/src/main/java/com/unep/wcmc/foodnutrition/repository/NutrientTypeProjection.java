package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.MeasureUnit;
import com.unep.wcmc.foodnutrition.model.NutrientType;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;


@Projection(name = "nutrientTypeProjection", types = NutrientType.class)
public interface NutrientTypeProjection {

    Long getId();

    String getName();

    MeasureUnit getUnit();

    Set<NutrientType> getChildren();

}
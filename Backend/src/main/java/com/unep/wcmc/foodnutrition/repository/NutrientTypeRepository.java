package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.MeasureUnit;
import com.unep.wcmc.foodnutrition.model.NutrientType;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;
import java.util.Set;

@RepositoryRestResource(path = "/nutrient-types", excerptProjection = NutrientTypeProjection.class)
public interface NutrientTypeRepository extends AbstractRepository<NutrientType> {

    @RestResource(path = "nutrients")
    List<NutrientType> findByParentName(@Param("parent") String parent);

    @RestResource(path = "name")
    NutrientType findByName(@Param("name") String name);

}

@Projection(name = "nutrientTypeProjection", types = NutrientType.class)
interface NutrientTypeProjection {

    Long getId();

    String getName();

    MeasureUnit getUnit();

    Set<NutrientType> getChildren();

}

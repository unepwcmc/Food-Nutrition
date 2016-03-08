package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.NutrientType;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "/nutrient-types")
public interface NutrientTypeRepository extends AbstractRepository<NutrientType> {

    @RestResource(path = "nutrients")
    List<NutrientType> findByParentName(@Param("parent") String parent);

    @RestResource(path = "name")
    NutrientType findByName(@Param("name") String name);

}
package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.ShapeForm;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/shape-forms")
public interface ShapeFormRepository extends AbstractRepository<ShapeForm> {
}

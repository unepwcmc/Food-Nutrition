package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.Colour;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/colours")
public interface ColourRepository extends AbstractRepository<Colour> {
}

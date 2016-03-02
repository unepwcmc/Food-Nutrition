package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.CookingDegree;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CookingDegreeRepository extends AbstractRepository<CookingDegree> {
}

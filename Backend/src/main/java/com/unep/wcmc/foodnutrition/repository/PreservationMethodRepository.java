package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.PreservationMethod;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/preservation-methods")
public interface PreservationMethodRepository extends AbstractRepository<PreservationMethod> {
}

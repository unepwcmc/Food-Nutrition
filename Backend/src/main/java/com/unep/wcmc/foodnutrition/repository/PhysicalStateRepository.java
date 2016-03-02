package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.PhysicalState;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/physical-states")
public interface PhysicalStateRepository extends AbstractRepository<PhysicalState> {
}

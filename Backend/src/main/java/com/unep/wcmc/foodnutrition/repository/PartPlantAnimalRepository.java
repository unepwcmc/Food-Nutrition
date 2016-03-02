package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.PartPlantAnimal;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/part-plan-animals")
public interface PartPlantAnimalRepository extends AbstractRepository<PartPlantAnimal> {
}

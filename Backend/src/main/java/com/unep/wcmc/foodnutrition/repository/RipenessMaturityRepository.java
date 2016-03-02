package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.RipenessMaturity;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/ripeness-maturities")
public interface RipenessMaturityRepository extends AbstractRepository<RipenessMaturity> {
}

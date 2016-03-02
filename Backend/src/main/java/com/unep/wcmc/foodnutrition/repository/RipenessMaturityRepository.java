package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.RipenessMaturity;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RipenessMaturityRepository extends AbstractRepository<RipenessMaturity> {
}

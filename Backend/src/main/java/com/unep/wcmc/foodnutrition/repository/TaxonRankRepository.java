package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.TaxonRank;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/taxon-ranks")
public interface TaxonRankRepository extends AbstractRepository<TaxonRank> {
}

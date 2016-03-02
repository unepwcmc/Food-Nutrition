package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.ContactSurfaceContainer;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/contact-surfaces")
public interface ContactSurfaceContainerRepository extends AbstractRepository<ContactSurfaceContainer> {
}

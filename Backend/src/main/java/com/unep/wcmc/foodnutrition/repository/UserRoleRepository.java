package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.UserRole;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRoleRepository extends AbstractRepository<UserRole> {
    
    UserRole findByRole(String role);

    UserRole findByName(String name);
}

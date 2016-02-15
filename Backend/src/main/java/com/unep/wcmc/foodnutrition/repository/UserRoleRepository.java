package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.UserRole;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;

public interface UserRoleRepository extends AbstractRepository<UserRole> {
    
    UserRole findByRole(String role);

    UserRole findByName(String name);
}

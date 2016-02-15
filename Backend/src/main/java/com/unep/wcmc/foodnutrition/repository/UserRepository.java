package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.User;
import com.unep.wcmc.foodnutrition.model.UserRole;
import com.unep.wcmc.foodnutrition.support.AbstractRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository extends AbstractRepository<User> {

    User findByEmail(String email);

    User findByUsername(String username);

    Page<User> findByFirstNameContaining(String firstName, Pageable pageable);

    List<User> findAllByUserRole(UserRole userRole);

}

package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.ForgetPasswordToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ForgetPasswordTokenRepository extends CrudRepository<ForgetPasswordToken, Long> {
	
	ForgetPasswordToken findByToken(String token);
}

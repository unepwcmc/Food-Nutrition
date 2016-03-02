package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.ForgetPasswordToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface ForgetPasswordTokenRepository extends CrudRepository<ForgetPasswordToken, Long> {
	
	ForgetPasswordToken findByToken(String token);
}

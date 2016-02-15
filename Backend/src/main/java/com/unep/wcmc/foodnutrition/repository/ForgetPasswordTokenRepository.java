package com.unep.wcmc.foodnutrition.repository;

import com.unep.wcmc.foodnutrition.model.ForgetPasswordToken;
import org.springframework.data.repository.CrudRepository;

public interface ForgetPasswordTokenRepository extends CrudRepository<ForgetPasswordToken, Long> {
	
	ForgetPasswordToken findByToken(String token);
}

package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.model.User;



public interface UserService<UserRegistrationDto> extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

	User save(UserRegistrationDto registrationDto);
	}
	


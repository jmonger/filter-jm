package com.interview.filterjm.repositories;

import com.interview.filterjm.exceptions.UserException;
import com.interview.filterjm.domain.User;


public interface UserRepository {
	
	Integer create(String firstName, String surName, String role, Integer age) throws UserException;
	
	User findByFirstNameAndSurName(String firstName, String surName) throws UserException;
	
	Integer getCountByAge(Integer age);
	
	Integer getCountByFirstNameAndSurname(String firstName, String surName);
	
	User findById(Integer id);
	
	
}

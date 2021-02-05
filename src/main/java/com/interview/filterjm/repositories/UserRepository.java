package com.interview.filterjm.repositories;

import com.interview.filterjm.exceptions.UserException;
import com.interview.filterjm.exceptions.UserResourceNotFoundException;

import java.util.List;

import com.interview.filterjm.domain.User;


public interface UserRepository {
	
	Integer create(String firstName, String surName, String role, Integer age) throws UserException;
	
	List<User> getAllUsers() throws UserException;
	
	List<User> getUsersByFirstName(String firstName) throws UserException;
	
	List<User> getUsersBySurName(String surName) throws UserException;
	
	List<User> getUsersByRole(String role) throws UserException;

	List<User> getUsersByAge(Integer age) throws UserException;
	
	User getUserById(Integer id) throws UserResourceNotFoundException;

	Integer getCountByFirstNameAndSurname(String firstName, String surName) throws UserException;
	
	
}

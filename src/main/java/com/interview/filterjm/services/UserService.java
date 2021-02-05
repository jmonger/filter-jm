package com.interview.filterjm.services;

import java.util.List;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;

public interface UserService {
	
	User validateUser(String firstName, String lastName) throws UserException;
	
	User addUser(String firstName, String surName, String role, Integer age) throws UserException;
	
	List<User> getAllUsers() throws UserException;
	
	User getUserById(Integer id) throws UserException;
	
	List<User> getUsersByFirstName(String firstName) throws UserException;
	
	List<User> getUsersBySurName(String surName) throws UserException;

	List<User> getUsersByRole(String role) throws UserException;

	List<User> getUsersByAge(Integer age) throws UserException;

	
	

}

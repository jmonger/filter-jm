package com.interview.filterjm.services;
import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;

public interface UserService {
	
	User validateUser(String firstName, String lastName) throws UserException;
	
	User addUser(String firstName, String surName, String role, Integer age) throws UserException;
	
	

}
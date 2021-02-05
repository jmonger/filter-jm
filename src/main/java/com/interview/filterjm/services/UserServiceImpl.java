package com.interview.filterjm.services;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;
import com.interview.filterjm.repositories.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User validateUser(String firstName, String lastName) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(String firstName, String surName, String role, Integer age) throws UserException {
		Integer count = userRepository.getCountByFirstNameAndSurname(firstName, surName);
		if(count > 0) {
			throw new UserException("User already exists.");
		}
		Integer id = userRepository.create(firstName, surName, role, age);
		return userRepository.getUserById(id);
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		return userRepository.getAllUsers();
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		return userRepository.getUserById(id);
	}

	@Override
	public List<User> getUsersByFirstName(String firstName) throws UserException {
		return userRepository.getUsersByFirstName(firstName);
	}

	@Override
	public List<User> getUsersBySurName(String surName) throws UserException {
		return userRepository.getUsersBySurName(surName);
	}

	@Override
	public List<User> getUsersByRole(String role) throws UserException {
		return userRepository.getUsersByRole(role);
	}

	@Override
	public List<User> getUsersByAge(Integer age) throws UserException {
		return userRepository.getUsersByAge(age);
	}

}

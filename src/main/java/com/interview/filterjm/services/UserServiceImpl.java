package com.interview.filterjm.services;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;
import com.interview.filterjm.repositories.UserRepository;

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
		return userRepository.findById(id);
	}

}

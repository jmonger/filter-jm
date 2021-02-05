package com.interview.filterjm.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.services.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<Map<String, String>> addUser(@RequestBody Map<String, Object> userMap) {
		String firstName = (String) userMap.get("firstname");
		String surName = (String)  userMap.get("surname");
		String role = (String) userMap.get("role");
		Integer age = (Integer) userMap.get("age");
		User user = userService.addUser(firstName, surName, role, age);
		Map<String, String> map = new HashMap<>();
		map.put("message", "User added successfully");
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	
	
	
}

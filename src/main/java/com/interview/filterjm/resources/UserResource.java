package com.interview.filterjm.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.services.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(HttpServletRequest request, @PathVariable("id") Integer id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);	
	}
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUsers(HttpServletRequest request) {
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping("/first/{firstName}")
	public ResponseEntity<List<User>> getUsersByFirstName(HttpServletRequest request, @PathVariable("firstName") String firstName) {
		List<User> users = userService.getUsersByFirstName(firstName);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping("/sur/{surName}")
	public ResponseEntity<List<User>> getUsersBySurName(HttpServletRequest request, @PathVariable("surName") String surName) {
		List<User> users = userService.getUsersBySurName(surName);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping("/role/{role}")
	public ResponseEntity<List<User>> getUsersByRole(HttpServletRequest request, @PathVariable("role") String role) {
		List<User> users = userService.getUsersByRole(role);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping("/age/{age}")
	public ResponseEntity<List<User>> getUsersByAge(HttpServletRequest request, @PathVariable("age") Integer age) {
		List<User> users = userService.getUsersByAge(age);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	
	
	
	
}

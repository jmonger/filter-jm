package com.interview.filterjm.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.interview.filterjm.domain.User;

@RequestMapping("/api/users/exclude")
public class UserExcludeResource extends UserResource {
	@GetMapping("/{id}")
	public ResponseEntity<User> excludeUserById(HttpServletRequest request, @PathVariable("id") Integer id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);	
	}
}

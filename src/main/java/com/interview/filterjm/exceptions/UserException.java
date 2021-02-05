package com.interview.filterjm.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UserException extends RuntimeException {
	
	public UserException(String message) {
		super(message);
	}

}

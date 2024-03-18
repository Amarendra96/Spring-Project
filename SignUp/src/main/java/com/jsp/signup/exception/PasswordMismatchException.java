package com.jsp.signup.exception;

public class PasswordMismatchException extends Exception {
	
	private String message;

	public PasswordMismatchException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}

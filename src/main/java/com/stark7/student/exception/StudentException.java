package com.stark7.student.exception;

import org.springframework.http.HttpStatus;

public class StudentException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private HttpStatus status;

	public StudentException(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}

	public StudentException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus staus) {
		this.status = staus;
	}

	@Override
	public String toString() {
		return "StudentException [message=" + message + ", staus=" + status + "]";
	}

}

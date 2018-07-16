package com.stark7.student.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	private final Logger LOGGER = LogManager.getLogger(GlobalExceptionHandler.class);

	public GlobalExceptionHandler() {
		super();
	}

	@ExceptionHandler({ StudentException.class })
	public ResponseEntity<StudentException> handleException(StudentException ex, WebRequest request) {
		this.LOGGER.error("StudentException : " + ex);
		return new ResponseEntity<>(ex, ex.getStatus());
	}

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<StudentException> handleException(Exception ex) {
		this.LOGGER.error("StudentException : " + ex);
		StudentException exRes = new StudentException(ex.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(exRes, exRes.getStatus());
	}
}

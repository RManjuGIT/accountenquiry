package com.anz.wholesale.accountenquiry.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * Generic exception Handler
 * @author Manjunath
 *
 */
@ControllerAdvice
@RestController
public class GenericExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<String> handleAllExceptions(Exception ex, WebRequest request) {
	  return new ResponseEntity<>("Oops!! something wrong...", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

/**
 * 
 */
package com.borges.cursoangular.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ApplicationControllerAdvice {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private ApiErros handleValidationError(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		List<String> messageError = bindingResult.getAllErrors().stream().map(erro -> erro.getDefaultMessage())
				.collect(Collectors.toList());
		return new ApiErros(messageError);

	}

	@ExceptionHandler(ResponseStatusException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private ResponseEntity<?> handleResponseStatusExceptionError(ResponseStatusException ex) {
		HttpStatus status = ex.getStatus();
		ApiErros apiError = new ApiErros(ex.getMessage());
		return new ResponseEntity<>(apiError, status);
	}
}

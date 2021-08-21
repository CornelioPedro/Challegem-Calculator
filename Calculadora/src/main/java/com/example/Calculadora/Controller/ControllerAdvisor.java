package com.example.Calculadora.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.Calculadora.Misc.ApiResponseObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import org.springframework.validation.FieldError;



@RestControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler{
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, String> errors = new LinkedHashMap<>();

		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});

		String message = "Campo(os) inválidos!";
		
		Map<String, Object> res = new ApiResponseObject().response(Boolean.TRUE, message, errors);

		return new ResponseEntity<>(res, HttpStatus.OK);

	}

}

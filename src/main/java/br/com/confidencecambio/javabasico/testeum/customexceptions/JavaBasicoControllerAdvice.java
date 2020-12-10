package br.com.confidencecambio.javabasico.testeum.customexceptions;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class JavaBasicoControllerAdvice {
	
	@ExceptionHandler({InternalServerErrorException.class})
	public ResponseEntity<String> internalServerErrorException(InternalServerErrorException ex){
		
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({ConstraintViolationException.class})
	public ResponseEntity<String> handleInvalidArgumentValueException(ConstraintViolationException ex){
		
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	
	}

}

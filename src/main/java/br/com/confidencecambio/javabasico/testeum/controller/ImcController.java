package br.com.confidencecambio.javabasico.testeum.controller;

import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.testeum.customexceptions.InternalServerErrorException;
import br.com.confidencecambio.javabasico.testeum.service.ImcService;

@RestController
@Validated
public class ImcController {
	
	@Autowired
	private ImcService service;
	
	@GetMapping("/saude/imc")
	public ResponseEntity<Double> calculaImc(@RequestParam @Positive double altura, 
											 @RequestParam @Positive double peso) throws InternalServerErrorException{
		
		return new ResponseEntity<Double>(service.calculaImc(altura, peso), HttpStatus.OK);
	}

}

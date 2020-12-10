package br.com.confidencecambio.javabasico.testeum.service;

import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.testeum.customexceptions.InternalServerErrorException;

@Service
public class ImcService {
	
public double calculaImc(double altura, double peso) throws InternalServerErrorException{
		
		try {
			return peso/(Math.pow(altura, 2));
		} catch (RuntimeException e) {
			throw new InternalServerErrorException("Aconteceu algo errado no servidor, por favor entre em contato com o Administrador do sistema ou aguarde!");
		}
	}

}

package br.com.confidencecambio.javabasico.testedois;

import br.com.confidencecambio.javabasico.testedois.exception.NomeCompletoException;

public class Robo extends SerPensante{
	
	private static String quemSou = "Robo";

	public Robo(String nome) throws NomeCompletoException {
		super(nome, quemSou);
	}
	
	

}

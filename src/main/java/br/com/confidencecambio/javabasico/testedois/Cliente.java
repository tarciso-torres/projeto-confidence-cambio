package br.com.confidencecambio.javabasico.testedois;

import br.com.confidencecambio.javabasico.testedois.exception.NomeCompletoException;

public class Cliente extends SerPensante{
	
	private static String quemSou = "Cliente";

	public Cliente(String nome) throws NomeCompletoException {
		super(nome, quemSou);
	} 

}

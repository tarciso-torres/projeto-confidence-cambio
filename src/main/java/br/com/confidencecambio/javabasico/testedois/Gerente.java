package br.com.confidencecambio.javabasico.testedois;

import br.com.confidencecambio.javabasico.testedois.exception.NomeCompletoException;

public class Gerente extends SerPensante{
	
	private static String quemSou = "Gerente";

	public Gerente(String nome) throws NomeCompletoException {
		super(nome, quemSou);
	}  

}

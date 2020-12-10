package br.com.confidencecambio.javabasico.testedois;

import java.util.Scanner;

import br.com.confidencecambio.javabasico.testedois.exception.NomeCompletoException;

public class Main {

	public static void main(String args[]) throws NomeCompletoException {

		SerPensante serPensante;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome completo");
		String nomeCompleto = scanner.nextLine();

		System.out.println("Se for robo digite 1; Se for cliente digite 2; Se for Gerente digite 3");
		int tipoSerPensante = scanner.nextInt();

		switch (tipoSerPensante) {
		case 1:
			serPensante = new Robo(nomeCompleto);
			System.out.println(serPensante.getNomeAbreviado());
			System.out.println(serPensante.getNomeMaiusculo());
			System.out.println(serPensante.getPrimeiroNome());
			System.out.println(serPensante.getUltimoNome());
			break;
		case 2:
			serPensante = new Cliente(nomeCompleto);
			System.out.println(serPensante.getNomeAbreviado());
			System.out.println(serPensante.getNomeMaiusculo());
			System.out.println(serPensante.getPrimeiroNome());
			System.out.println(serPensante.getUltimoNome());
			break;
		case 3:
			serPensante = new Gerente(nomeCompleto);
			System.out.println(serPensante.getNomeAbreviado());
			System.out.println(serPensante.getNomeMaiusculo());
			System.out.println(serPensante.getPrimeiroNome());
			System.out.println(serPensante.getUltimoNome());
			break;
		}
	}

}

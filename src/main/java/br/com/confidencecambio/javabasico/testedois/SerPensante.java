package br.com.confidencecambio.javabasico.testedois;

import br.com.confidencecambio.javabasico.testedois.exception.NomeCompletoException;

public abstract class SerPensante {
	
	private String quemSou;
	
	private String nomeCompleto;
	
	public SerPensante(String nome, String quemSou) throws NomeCompletoException {
		this.nomeCompleto = nome.trim();
		this.quemSou = quemSou;
		validaNuloOuVazio();
	}
	
	@SuppressWarnings("unused")
	private SerPensante() {}
	
	private void validaNuloOuVazio() throws NomeCompletoException {
		if(nomeCompleto.isBlank()) {
			throw new NomeCompletoException("Nome não pode ser vazio");
		}
		
		if(nomeCompleto.equals(null)) {
			throw new NomeCompletoException("Nome não pode ser nulo");
		}
	}
	
	public String getRemoverEspaçosAMais() {
		String semEspacos = nomeCompleto.trim();
		return "Remover espaços a mais do " + quemSou + " " + semEspacos;
	}
	
	public String getPrimeiroNome() {
		return "Nome primeiro nome do " + quemSou + " " + arrayNomes()[0];
	}
	
	public String getUltimoNome() {
		String[] nomes = arrayNomes();
		nomes[0] = "";
		return "Retornar ultimo nome do " + quemSou + " " + String.join(" ", nomes);
	}
	
	public String getNomeMaiusculo() {
		return "Nome escrito em maiusculo do" + quemSou + " " + nomeCompleto.toUpperCase();
	}
	
	public String getNomeAbreviado() {
		String[] nomes = arrayNomes();
		
		if(nomes.length <= 2) {
			return nomeCompleto;
		}
		
		for(int i = 0; i < nomes.length; i++) {
			if(i != 0  && i <  nomes.length -1) {
				nomes[i] = nomes[i].substring(0, 1) + ".";
			}
		}
		
		return "Nome Abreviado do Robo do " + quemSou + " " + String.join(" ", nomes);
	}
	
	private String[] arrayNomes() {
		String nomes[] = nomeCompleto.split(" ");
		return nomes;
	}
}

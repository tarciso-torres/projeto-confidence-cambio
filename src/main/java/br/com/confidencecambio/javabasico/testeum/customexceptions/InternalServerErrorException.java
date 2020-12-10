package br.com.confidencecambio.javabasico.testeum.customexceptions;

public class InternalServerErrorException extends Exception{

	private static final long serialVersionUID = 3103085053356955717L;
	
	public InternalServerErrorException() {
		super();
	}
	
	public InternalServerErrorException(String mensagem) {
		super(mensagem);
	}

}

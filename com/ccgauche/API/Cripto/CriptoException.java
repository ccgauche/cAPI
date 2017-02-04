package com.ccgauche.API.Cripto;

public class CriptoException extends Exception{

	private static final long serialVersionUID = 7119150609602783136L;

	public CriptoException(ErrorType e,Key k) {
		String message="";
		if (e.equals(ErrorType.UnCriptError)) {
			message="Le deCriptage avec la clé "+k.key+" est inpossible.";
		} else if (e.equals(ErrorType.InvalidKey)) {
			message="La clée "+k.key+" n'est pas explotable.";
		}
		System.out.println(message);
	}
}

package javaCore.Oexception.exception.test;

import java.util.Scanner;

import javaCore.Oexception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException {
		try (Scanner teclado = new Scanner(System.in)) {
			String usernameDB = "Goku"; 
			String senhaDB = "ssj";
			
			System.out.println("Usuário");
			String usernameDigitado = teclado.nextLine();
			System.out.println("Senha");
			String senhaDigitada = teclado.nextLine();
			
			if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
				throw new LoginInvalidoException("Usuario ou senha inválidos");
			}
		}
		System.out.println("Usuario logado com sucesso");
	}
}

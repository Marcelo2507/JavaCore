package javaCore.Gassociacao.test;

import java.util.Scanner;

public class BrincadeiraTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("O grande software de previssão do futuro");
		System.out.println("Digite sua pergunta e eu responderei [sim / não]");
		
		String pergunta = input.nextLine();
		
		if (pergunta.charAt(0) == ' ') {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");
		}
		
		input.close();
	
	}
}

package javaCore.QString.test;

public class StringTest01 {
	public static void main(String[] args) {
		String nome = "William"; //String constant Pool		
		String nome2 = "William";
		
		nome = nome.concat(" saas");
		
		System.out.println(nome);
		System.out.println(nome == nome2);
		
		String nome3 = new String("William");// 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
		
		System.out.println(nome2 == nome3);// false
		System.out.println(nome2 == nome3.intern());// true
		
	}
}

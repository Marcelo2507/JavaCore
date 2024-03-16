package javaCore.QString.test;

public class StringBuilderTest01 {
	public static void main(String[] args) {
//		STRINGS SÃO IMUTAVEIS
		String nome = "Willian Suane";
		nome.concat(" Devdojo");
		System.out.println(nome);
		
//		STRINGS DUILDER/BUFFER SÃO MUTAVEIS
		StringBuilder sb = new StringBuilder("Willian Suane");
		sb.append(" DevDojo").append(" Academy");
		sb.reverse();
		sb.reverse();
		sb.delete(0, 3);
		System.out.println(sb);
	}
}

package javaCore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
	public static void main(String[] args) {
		int divisao = divisao(2, 2);
		System.out.println(divisao);
		System.out.println("Código finalizado");
	}
	
	/**
	 * 
	 * @param a
	 * @param b não pode ser zero
	 * @return
	 * @throws IllegalArgumentException caso b seja zero
	 */
	
	//Avisando que pode lançar IllegalArgumentException
	private static int divisao(int  a, int b){
		if (b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
		}
		return a/b;
	}
}

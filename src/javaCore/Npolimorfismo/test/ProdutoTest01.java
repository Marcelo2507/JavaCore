package javaCore.Npolimorfismo.test;

import javaCore.Npolimorfismo.domain.Computador;
import javaCore.Npolimorfismo.domain.Televisao;
import javaCore.Npolimorfismo.domain.Tomate;
import javaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador computador = new Computador("NUC10i7", 11000);
		Tomate tomate = new Tomate("Italiana", 10);
		Televisao tv = new Televisao("Sansung 50\" ", 5000);
		
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("----------------------------");
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("----------------------------");
		CalculadoraImposto.calcularImposto(tv);
		
		
		
	}

}

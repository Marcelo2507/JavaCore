package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.domain.Produto;
import javaCore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
	
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatorio de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		if(produto instanceof Tomate) {
			String dataValidade = ((Tomate) produto).getDataValidade();
			System.out.println(		dataValidade	);
		}
	}
	
//	public static void calcularImpostoComputador(Computador computador) {
//	double imposto = computador.calcularImposto();
//
//	System.out.println("Relatorio de imposto do computador");
//	System.out.println("Computador " + computador.getNome());
//	System.out.println("Valor " + computador.getValor());
//	System.out.println("Imposto a ser pago " + imposto);
//}
//
//public static void calcularImpostoTomate(Tomate tomate) {
//	double imposto = tomate.calcularImposto();
//
//	System.out.println("Relatorio de imposto do tomate");
//	System.out.println("Tomate " + tomate.getNome());
//	System.out.println("Valor " + tomate.getValor());
//	System.out.println("Imposto a ser pago " + imposto);
//}
	
}

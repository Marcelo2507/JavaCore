package javaCore.JmodificadorFinal.test;

import javaCore.JmodificadorFinal.domain.Carro;
import javaCore.JmodificadorFinal.domain.Ferrari;

public class CarroTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		
//		System.out.println(Carro.VELOCIDADE_LIMITE);
//		System.out.println(carro.COMPRADOR);
//		carro.COMPRADOR.setNome("Daniel");
//		System.out.println(carro.COMPRADOR);
		
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Enzo");
		ferrari.imprime();
	}
}

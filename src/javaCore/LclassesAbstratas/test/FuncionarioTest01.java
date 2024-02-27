package javaCore.LclassesAbstratas.test;

import javaCore.LclassesAbstratas.dominio.Desenvolvedor;
import javaCore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Funcionario funcionario = new Funcionario("Zoro", 2000);
		Gerente gerente = new Gerente("Nami", 5000);
		Desenvolvedor dev = new Desenvolvedor("Sanji", 3000);
//		System.out.println(funcionario);
		System.out.println(gerente);
		System.out.println(dev);
		
		gerente.imprime();
		dev.imprime();
	}

}

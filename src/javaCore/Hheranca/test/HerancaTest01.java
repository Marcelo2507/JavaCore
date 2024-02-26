package javaCore.Hheranca.test;

import javaCore.Hheranca.domain.Endereco;
import javaCore.Hheranca.domain.Funcionario;
import javaCore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("012345-209");
		
		Pessoa pessoa = new Pessoa("Marcelo Arnaldo");

		pessoa.setCpf("1111111111");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario("Luigi Parente");

		funcionario.setCpf("22222222222");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		
		System.out.println("-----------------------------");
		
		funcionario.imprime();
	}
}

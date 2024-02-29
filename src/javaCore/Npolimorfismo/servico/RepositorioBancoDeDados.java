package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando em um Banco de Dados");
	}
}

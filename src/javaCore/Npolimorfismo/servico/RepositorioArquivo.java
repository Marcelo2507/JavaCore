package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo");
	}
	
}

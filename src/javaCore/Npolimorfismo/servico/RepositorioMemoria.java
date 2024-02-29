package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando em Memória");
	}
}

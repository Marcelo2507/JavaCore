package javaCore.Npolimorfismo.test;

import javaCore.Npolimorfismo.repositorio.Repositorio;
import javaCore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBancoDeDados();
		repositorio.salvar();
	}
}

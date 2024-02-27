package javaCore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Carregando dados do banco de dados");
	}
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Deletando dados de um Banco de dados");
	}
	
	@Override
	public void checkPermision() {
		System.out.println("Checando permissões no banco de dados");
	}
}

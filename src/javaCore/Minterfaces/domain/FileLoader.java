package javaCore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Caregando dados de um arquivo");
	}
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Deletando dados de um arquivo");
	}
	
	@Override
	public void checkPermision() {
		System.out.println("Checando permissões nos arquivos");
	}
}

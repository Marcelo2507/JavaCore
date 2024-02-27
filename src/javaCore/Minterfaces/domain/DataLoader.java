package javaCore.Minterfaces.domain;

public interface DataLoader {
	void load();
	
	default void checkPermision() {
		System.out.println("Fazendo checagem de permissões");
	}
}

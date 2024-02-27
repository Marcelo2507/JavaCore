package javaCore.Minterfaces.test;

import javaCore.Minterfaces.domain.DatabaseLoader;
import javaCore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		
		databaseLoader.load();
		fileLoader.load();
	}

}

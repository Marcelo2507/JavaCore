package javaCore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

	public static void main(String[] args) { 
		try {
			throw new ArrayIndexOutOfBoundsException();
		}catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
			System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		}
//		EXCESSÕES MAOS GENERICAS VIRAM MAIS PRO FINAL PARA QUE AS DEMAIS
//		PROVENIENTES FILHAS DELA VENHAM A SER USADAS
		catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
	
		
		
		try {
			talvez();
		}catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	private static void talvez() throws SQLException, FileNotFoundException{
		

	}
}
package javaCore.Oexception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable{
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Fechando Leitor 2");
	}
}

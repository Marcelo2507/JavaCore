package javaCore.Kenum.test;

import javaCore.Kenum.domain.Cliente;
import javaCore.Kenum.domain.TipoCliente;

public class ClienteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 =  new Cliente("Marcelo A", TipoCliente.PESSOA_FISICA);
		Cliente cliente2 =  new Cliente("Marcelo B", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente3 =  new Cliente("Marcelo C", TipoCliente.PESSOA_FISICA);
		Cliente cliente4 =  new Cliente("Marcelo D", TipoCliente.PESSOA_JURIDICA);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		System.out.println(cliente4);
		
	}
}

package javaCore.Kenum.test;

import javaCore.Kenum.domain.Cliente;
import javaCore.Kenum.domain.TipoCliente;
import javaCore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 =  new Cliente("Marcelo A", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente cliente2 =  new Cliente("Marcelo B", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
	}
}
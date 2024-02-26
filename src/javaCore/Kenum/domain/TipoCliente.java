package javaCore.Kenum.domain;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Fisica"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	public final int VALOR;
	private String relatorio;
	
	TipoCliente(int valor, String relatorio){
		this.VALOR = valor;
		this.relatorio = relatorio;
	}

	public String getRelatorio() {
		return relatorio;
	}	
	
}

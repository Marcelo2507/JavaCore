package javaCore.JmodificadorFinal.domain;

public class Carro {
	private String nome;
	//valor constante
	public static final double VELOCIDADE_LIMITE;
	public final Comprador COMPRADOR = new Comprador();
	
	//garata que a const sejá a primeira a inicializar com algum valor 
	static {
		VELOCIDADE_LIMITE = 250;
	}
	
	//por causa do final ele não pode ser sobreescrito
	public final void imprime() {
		System.out.println(this.nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

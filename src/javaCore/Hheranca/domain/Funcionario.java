package javaCore.Hheranca.domain;

/*EXTENDENDO AS ESPECIFICAÇÕES DE "PESSOA" PARA FUNCIONARIO*/

public class Funcionario extends Pessoa{
	private double salario;
	static {
		System.out.println("Dentro do bloco inicialização estático de funcionario");
	}
	{
		System.out.println("Dentro do bloco de inicialização funcionario 1");
	}
	{
		System.out.println("Dentro do bloco de inicialização funcionario 2");
	}
	
	
	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionario");
	}
	
	
	/*
	 * NESTE MOMENTO ESTAMOS SOBREESCREVENDO O METODO "imprime()" 
	 * APAGANDO OS CÓDIGOS DO METODO ANTERIOR	 * 
	 * */
	
	public void imprime() {
		super.imprime();//assim como 'this' o 'super' pode importar o metodo com o qual está utilizando no monento
		System.out.println(this.salario);
	}
	
	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + "recebi o salario de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

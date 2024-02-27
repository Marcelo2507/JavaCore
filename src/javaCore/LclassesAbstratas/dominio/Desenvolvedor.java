package javaCore.LclassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}

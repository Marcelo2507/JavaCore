package javaCore.SeminarioEscolar.domain;

/*O ALUNO SÓ PODE ESTAR EM 1 SEMONÁRIO*/

public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

package javaCore.SeminarioEscolar.test;

import javaCore.SeminarioEscolar.domain.Aluno;
import javaCore.SeminarioEscolar.domain.Local;
import javaCore.SeminarioEscolar.domain.Professor;
import javaCore.SeminarioEscolar.domain.Seminario;

public class AssociacaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local local = new Local("Rua das Laranjeiras");
		Aluno aluno = new Aluno("Luffy", 17);
		Professor professor = new Professor("Barba Branca", "Pirata");
		Aluno[] alunosParaSeminario = {aluno};
		Seminario seminario = new Seminario("Onde achar o OnePiece", alunosParaSeminario, local);
	
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}

}

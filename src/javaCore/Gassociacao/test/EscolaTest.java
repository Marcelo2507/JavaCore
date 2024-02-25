package javaCore.Gassociacao.test;

import javaCore.Gassociacao.domain.Escola;
import javaCore.Gassociacao.domain.Professor;

public class EscolaTest {
	public static void main(String[] args) {
		Professor professor = new Professor("Jiraya");
		Professor[] professores = {professor};
		Escola escola = new Escola("Konoha", professores);
		
		escola.imprime();
		
	}
}

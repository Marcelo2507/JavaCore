package javaCore.Gassociacao.test;

import javaCore.Gassociacao.domain.Jogador;
import javaCore.Gassociacao.domain.Time;

public class JogadorTest02 {	
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		
		Time time = new Time("Seleção Brasileira");
		
		jogador1.setTime(time);
		
		jogador1.imprime();
	}
}

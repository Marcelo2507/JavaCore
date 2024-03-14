package javaCore.Oexception.exception.test;


import javaCore.Oexception.exception.dominio.Funcionario;
import javaCore.Oexception.exception.dominio.LoginInvalidoException;
import javaCore.Oexception.exception.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
	
		
		try {
			funcionario.salvar();
		} catch (LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

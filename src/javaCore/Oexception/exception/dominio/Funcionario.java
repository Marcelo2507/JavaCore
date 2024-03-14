package javaCore.Oexception.exception.dominio;



	/**
	 * ******************************
	 * QUANDO ESTIVER SOBREESCREVENDO
	 * ******************************
	 * 
	 * 1° — PODE LANÇAR NENHUMA EXCEÇÃO
	 * 2° — PODE LANÇAR UMA OU MAIS EXCEÇÔES
	 * 3° — PODE LANÇAR UNCHEKED, RUNTIME 
	 * 4° — NÃO PODE LANÇAR EXCEÇÕES MAIS GENERICAS
	 * 5° — NÃO PODE LANÇAR EXCEÇÕES TIPO CHEKED QUE NÃO FOI DECLARADA NO METODO ORIGINAL
	  */
public class Funcionario extends Pessoa{
	public void salvar() throws LoginInvalidoException, ArithmeticException {
		System.out.println("Salvando funcionario");
	}
}

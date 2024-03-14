package javaCore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {

	public static void main(String[] args) {
		abreConexao2();
		abreConexao();
}

	private static String abreConexao() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo no arquivo");
			return "conexão aberta";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("Fechando recurso liberado pelo SO");
		}
		
		return null;
	}
	
	//EXECUTA POREM NÃO É TRATADO OS SEUS ERROS
	private static void abreConexao2() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo no arquivo");
			throw new RuntimeException();
		}finally {
			System.out.println("Fechando recurso liberado pelo SO");
		}
	}

}

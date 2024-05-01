package javaCore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {

	public static void main(String[] args) {
		// \d = Todos os digitos
		// \D = Tudo o que não for dígito
		// \s = Todos os espaços em branco \t \n \f \r
		// \S = Todos os carácteres excluindos os brancos
		// \w = Tudo o que for de a - z,A - Z, dígitos, _
		// \W = Tudo o que NÃO for de a - z,A - Z, dígitos, _
		// []
		// ? Zero ou uma
		// * Zero ou mais
		// + Uma ou mais
		// {n,n} de n até n
		// () agrupamento
		// | "OU"
		// $ fim da linha
		
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

		String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto:  " + texto);
		System.out.println("Índice: 0123456789");
		System.out.println("regex: "+regex);
		System.out.println("Posições encontradas");
		
		System.out.println("-------------");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group()+ "\n");
		}
		

		
	}

}

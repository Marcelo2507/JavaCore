package javaCore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {

	public static void main(String[] args) {
		// \d = Todos os digitos
		// \D = Tudo o que não for dígito
		// \s = Todos os espaços em branco \t \n \f \r
		// \S = Todos os carácteres excluindos os brancos
		// \w = Tudo o que for de a - z,A - Z, dígitos, _
		// \W = Tudo o que NÃO for de a - z,A - Z, dígitos, _
		String regex = "\\W";
//		String texto = "abaaba";
		String texto2 = "jhrfh@$#%$ rygfyh2u4h¨¨3ht5h!@";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);
		System.out.println("Texto:  " + texto2);
		System.out.println("Índice: 0123456789");
		System.out.println("regex: "+regex);
		System.out.println("Posições encontradas");
		
		System.out.println("-------------");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group()+ "\n");
		}
		
	}

}

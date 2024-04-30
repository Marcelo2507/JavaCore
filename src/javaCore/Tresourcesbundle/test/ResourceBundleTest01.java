package javaCore.Tresourcesbundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		
		System.out.println("----------------");
		
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		boolean hello = bundle.containsKey("hello");
		System.out.println(hello);
		System.out.println(bundle.getString("hello"));
		
		boolean goodMorning = bundle.containsKey("good.morning");
		System.out.println(goodMorning);
		System.out.println(bundle.getString("good.morning"));

		System.out.println("----------------");
		
		System.out.println("hi");

		
		System.out.println("----------------"); System.out.println("----------------");
		
		bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		boolean hello2 = bundle.containsKey("hello");
		System.out.println(hello2);
		System.out.println(bundle.getString("hello"));
		
		boolean goodMorning2 = bundle.containsKey("good.morning");
		System.out.println(goodMorning2);
		System.out.println(bundle.getString("good.morning"));
		
		//Locale("fr", "CA");
		//messages_fr_CA.properties		——PRIMEIRO ELE IRÁ PROCURAR
		//messages_fr.properties 	——CASO NÃO ACHE PROCURA-RA SOMENTE A LÍNGUA
		//messages_pt_BR.properties		——CASO NÃO ACHE, IRÁ RETORNAR PARA A LÍNGUA ORIGNAL
		//messages_pt.properties	——CASO NÃO ACHE PROCURA-RA SOMENTE A LÍNGUA
		//messages.properties 	——SE NÃO ACHAR, ENTÃO IRÁ PROCURAR PELO ARQUIVO BASE
		
		System.out.println("----------------");
		
		System.out.println("hi");
	}
}

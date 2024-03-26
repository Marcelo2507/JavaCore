package javaCore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getCurrencyInstance();
		nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
		nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
		nfa[3] = NumberFormat.getCurrencyInstance(localeIT);	
	
		double valor = 1000.2130;
		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}

		
		String valorString = "1000,2130";
		try {
			System.out.println(nfa[0].parse(valorString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

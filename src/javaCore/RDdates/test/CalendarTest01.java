package javaCore.RDdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingo é o primeiro dia da semana\n");
		}
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "\n");
				
		c.add(Calendar.DAY_OF_MONTH, 2);//ADICIONA AO TEMPO
		c.roll(Calendar.HOUR, 2);//ADICIONA TEMPO SEM CONVERTER O DIA NO CASO
		
		Date date = c.getTime();
		System.out.println(date);
	}
}

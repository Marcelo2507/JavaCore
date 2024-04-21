package javaCore.RDdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
		Period p1 = Period.between(now, nowAfterTwoYears);
		Period p2 = Period.ofDays(10);//CAPTURA UM PERIODO EM DIAS
		Period p3 = Period.ofWeeks(58);//APTURA UM PERIODO DE SEMANAS E TRANSFORMA EM DIAS 
		/**
		 * "PERIOD" NÃO TRABALHA COM SEMANAS 
		 * E TRANSFORMA EM DIAS
		 * */
		Period p4 = Period.ofMonths(3);//CAPTURA UM PERIODO EM MESES
		Period p5 = Period.ofYears(5);//CAPTURA UM PERIUDO EM ANOS
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		/**
		 * TRANSFORMANDO SEMANAS EM MESES 
		 * */
		//ERRADO, METODO GAMBIARRA
		System.out.println(p3.getMonths());
		System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
		//CERTO
		System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
		
	}

}

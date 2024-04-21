package javaCore.RDdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		//SETANDO MINHA DATA
		now = now.with(ChronoField.DAY_OF_MONTH, 21);
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO A PROXIMA OU MESMA DATA DE TERÇA
		now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO A PROXIMA DATA DE TERÇA
		now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO A ANTERIOR DATA DE TERÇA
		now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO O PRIMEIRO DIA DO MÊS
		now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO O ULTIMO DIA DO MÊS
		now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO O PRIMEIRO DIA DO PRÓXIMO ANO
		now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//SETANDO O PRIMEIRO DIA DO PRÓXIMO MÊS
		now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
	}
}

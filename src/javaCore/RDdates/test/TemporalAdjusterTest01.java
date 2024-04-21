package javaCore.RDdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximodiaUtil implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

		int addDays;
		switch (dayOfWeek) {
		case THURSDAY:
			addDays = 4;
			break;
		case FRIDAY:
			addDays = 3;
			break;
		case SATURDAY:
			addDays = 2;
			break;
		default:
			addDays = 1;
		}

		return temporal.plus(addDays, ChronoUnit.DAYS);
	}
}

public class TemporalAdjusterTest01 {
	public static void main(String[] args) {
		
		//DIA DE HOJE
		LocalDate now = LocalDate.now();

		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//DIA DO PROXIMO DIA UTIL A PARTIR DE HOJE

		now = LocalDate.now().with(new ObterProximodiaUtil());

		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		//PROXIMO DIA UTIL A PARTIR DO DIA 15
		
		now = LocalDate.now().withDayOfMonth(15).with(new ObterProximodiaUtil());

		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//PROXIMO DIA UTIL A PARTIR DO DIA 26
		
		now = LocalDate.now().withDayOfMonth(26).with(new ObterProximodiaUtil());

		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//PROXIMO DIA UTIL A PARTIR DO DIA 27
		
		now = LocalDate.now().withDayOfMonth(27).with(new ObterProximodiaUtil());

		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		//PROXIMO DIA UTIL A PARTIR DO DIA 28
		
		now = LocalDate.now().withDayOfMonth(28).with(new ObterProximodiaUtil());

		System.out.println(now);
		System.out.println(now.getDayOfWeek());
	}
}

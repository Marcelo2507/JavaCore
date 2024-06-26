package javaCore.RDdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		/* SÃO OS MESMOS */
//		LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
		LocalDate date = LocalDate.parse("2022-08-06");

//		LocalTime time = LocalTime.of(9, 45, 21);
		LocalTime time = LocalTime.parse("09:45:00");
	
		System.out.println(localDateTime);
		System.out.println(date);
		System.out.println(time);
		
		LocalDateTime ldt1 = date.atTime(time);
		LocalDateTime ldt2 = time.atDate(date);
		System.out.println(ldt1);
		System.out.println(ldt2);
	}
}

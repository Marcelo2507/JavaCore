package javaCore.RDdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
	public static void main(String[] args) {
		/** 
		 * "CHRONOUNIT" ÓTIMO PARA QUANDO QUISER TRABALHAR 
		 * COM UM INTERVALO DE DATAS 
		 * */
		
		LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12,0,0);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(ChronoUnit.DAYS.between(aniversario, now));
		//CAPTURA QUANTOS DIAS SE PASSARAM DESDE A DATA 
		
		System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
		//CAPTURA QUANTAS SEMANAS SE PASSARAM DESDE A DATA 
		
		System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
		//CAPTURA QUANTOS MESES SE PASSARAM DESDE A DATA
		
		System.out.println(ChronoUnit.YEARS.between(aniversario, now));
		//CAPTURA QUANTOS ANOS SE PASSARAM DESDE A DATA
		
	}
}

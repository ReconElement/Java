package API;

import java.time.LocalDate;
import java.time.Month;

public class api1 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2023, 3, 11);
		LocalDate d2 = LocalDate.of(2023, Month.JULY, 4);
		LocalDate d3 = LocalDate.now();
		LocalDate d4 = LocalDate.parse("2019-12-21");
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfWeek());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getMonthValue());
	}

}

package API;

import java.time.LocalDate;

public class api4 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2021, 02, 9);
		System.out.println(d1.withDayOfMonth(10));
		System.out.println(d1.withDayOfYear(12));
		System.out.println(d1.withYear(2002));
		System.out.println(d1.withMonth(7));
	}
}

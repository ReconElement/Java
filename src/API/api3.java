package API;
import java.time.*;
public class api3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.of(2023, 7, 4);
		System.out.println(d1.plusDays(7));
		System.out.println(d1.plusWeeks(2));
		System.out.println(d1.plusMonths(2));
		System.out.println(d1.plusYears(1));
		System.out.println(d1.minusDays(2));
		System.out.println(d1.minusMonths(2));
		System.out.println(d1.minusYears(1));
		System.out.println(d1.minusWeeks(2));
	}

}

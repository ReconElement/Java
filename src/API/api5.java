package API;
import java.time.*;
public class api5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2023, 8, 01);
		System.out.println(date1.atTime(16, 30));
		System.out.println(date1.atTime(LocalTime.of(18, 00)));
		System.out.println(date1.atTime(16,30,30,200));

	}

}

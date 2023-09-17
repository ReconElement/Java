package API;
import java.time.*;
public class api15 {
	public static void main(String[] args) {
		Period p1= Period.of(0, 2, 50);
		System.out.println(p1.plusDays(20));
		System.out.println(p1.plusMonths(2));
		System.out.println(p1.plusYears(2));
		System.out.println(p1.withDays(20));
		System.out.println(p1.withMonths(12));
		System.out.println(p1.withYears(2).toTotalMonths());
		
	}
}

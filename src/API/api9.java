package API;
import java.time.*;
public class api9 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2023, 5, 19);
		LocalTime t = LocalTime.of(18, 30, 12);
		LocalDateTime dt = t.atDate(d);
		LocalDateTime dt1 = d.atTime(t);
		System.out.println(dt);
		System.out.println(dt1);
	}
}

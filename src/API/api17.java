package API;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class api17 {
	public static void main(String[] args) {
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy--MM--dd");
		LocalDate date = LocalDate.parse("1992--02--21",d1);
		System.out.println(date);
	}
}

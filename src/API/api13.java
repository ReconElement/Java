package API;
import java.time.*;
public class api13 {
	public static void main(String[] args) {
		LocalDate born= LocalDate.of(2001, 11, 02);
		Period age = Period.ofYears(14);
		LocalDate agethen = born.plus(age);
		System.out.println(agethen);
		System.out.println(born.minus(Period.ofYears(13)));
		
	}
}

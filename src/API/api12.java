package API;
import java.time.*;
public class api12 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2001, 02, 11);
		LocalDate current= LocalDate.now();
		Period time=Period.between(start, current);
		System.out.println(time);
		System.out.println(time.getDays());
		System.out.println(time.getMonths());
		System.out.println(time.getYears());
		System.out.println(time.isNegative());
		System.out.println(time.isZero());
		}
}

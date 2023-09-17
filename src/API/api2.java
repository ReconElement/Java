package API;
import java.time.*;
public class api2 {

	public static void main(String[] args) {
		LocalDate bday1 = LocalDate.parse("2002-02-11");
		LocalDate bday2 = LocalDate.parse("2002-07-21");
		System.out.println(bday2.isAfter(bday1));
		System.out.println(bday2.isBefore(bday1));
	}

}

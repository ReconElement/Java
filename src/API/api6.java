package API;
import java.time.*;
public class api6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate launchBook = LocalDate.of(2016,2,8);
		LocalDate aDate = LocalDate.of(1970,1,8);
		System.out.println(launchBook.toEpochDay());
		System.out.println(aDate.toEpochDay());
		LocalDate d1 = LocalDate.of(2002, 02, 11);
		System.out.println(d1.toEpochDay());
	}

}

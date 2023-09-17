package API;
import java.time.*;
public class api8 {
	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(00,11,20);
		LocalTime t2 = LocalTime.of(00, 11,29);
		if(t1.isBefore(t2))
			System.out.println("Tommy Wins");
		else
			System.out.println("Alfie Wins");
	}

}

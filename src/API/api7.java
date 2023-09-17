package API;
import java.time.*;
public class api7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t1 = LocalTime.of(00,30,57,90089);
		LocalTime t2 = LocalTime.parse("00:30:57");
		System.out.println(t1+" "+t2);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MAX);
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
		System.out.println(t1.getNano());
		System.out.println(t1.withHour(2));
		System.out.println(t1.withMinute(21));
		System.out.println(t1.withSecond(22));
		System.out.println(t1.withNano(20));
	}

}

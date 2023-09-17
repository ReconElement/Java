package API;
import java.time.*;
public class api11 {

	public static void main(String[] args) {
		Period p1=Period.parse("P1Y");
		Period p2=Period.parse("p2y");
		Period p3=Period.parse("P3y");
		Period p4=Period.parse("p4y2m3w6d");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}

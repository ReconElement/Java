package API;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class api16 {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate d1 = LocalDate.now();
		System.out.println(formatter.format(d1));
		LocalDateTime t1 = LocalDateTime.now();
		System.out.println(t1);
		DateTimeFormatter dt = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println(dt.format(t1));
		DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd |'TIME'| hh:mm:ss a");
		System.out.println(dt1.format(t1));
		System.out.println(formatter.format(t1));
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(formatter2.format(t1));
		LocalDateTime df= LocalDateTime.parse("2023/02/11 TIME 11:02:12 am",dt1);
		System.out.println(df);
	}
}

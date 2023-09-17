package Accenture;
import java.util.Scanner;
public class acc12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();
        float distance=(float)(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        System.out.println(distance);
	}
}

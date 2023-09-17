package Accenture;
import java.util.Scanner;
public class revNum {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number to get its reverse: ");
	        int x = sc.nextInt();
	        int revch = x;
	        int rem = 0, num = 0;
	        while (revch > 0) {
	            rem = revch % 10;
	            num = num * 10 + rem;
	            revch = revch / 10;
	        }
	        System.out.println(num);
	    }
	}

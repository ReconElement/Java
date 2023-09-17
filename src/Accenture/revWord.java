package Accenture;
import java.util.Scanner;
public class revWord {
	public static String revword(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+(s.charAt(i));
		}
		System.out.println(rev);
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to get its reverse: ");
		String s = sc.nextLine();
		System.out.println(revword(s));
	}
}
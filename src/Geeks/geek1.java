package Geeks;
import java.util.*;
public class geek1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to get it's reverse: ");
		String str=sc.nextLine();
		String newst="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newst=newst+str.charAt(i);
		}
		System.out.println(newst);
	}
}

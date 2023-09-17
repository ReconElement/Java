package Accenture;
import java.util.Scanner;
public class acc13 {
	public static int count(String s, char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				count++;
		}
		return count;
	}
	public static int autoNumber(String s)
	{
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(count(s,(char)(48+i))==(s.charAt(i)-'0'))
			{
				ct++;
			}
		}
		return ct;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find whether it is an autobiographical number or not: ");
		String s = sc.next();
		int count=autoNumber(s);
		System.out.println(count);
	}
}

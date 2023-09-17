package Accenture;
import java.util.Scanner;
public class palindrome {
	public static boolean check_palindrome(int num)
	{
		int m=num, rem=0, palin=0;
		while(m!=0)
		{
			rem=m%10;
			m=m/10;
			palin=palin*10+rem;
		}
		if(palin==num)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to find all palindrome numbers between them: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<b;i++)
		{
			if(check_palindrome(i)==true)
				System.out.println(i);
		}
	}
}

package Accenture;
import java.util.*;
public class fibonacci_recursion {
	static int nexterm,a=0,b=1;
	public static void fib(int n)
	{
		if(n>0)
		{
			nexterm=a+b;
			a=b;
			b=nexterm;
			System.out.print(","+nexterm);
			fib(n-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get its fibonacci series upto it using recursion: ");
		int n = sc.nextInt();
		System.out.print(a+","+b);
		fib(n);
	}
}

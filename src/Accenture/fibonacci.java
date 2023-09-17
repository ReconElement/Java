package Accenture;
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want your fibonacci series: ");
		int n=sc.nextInt();
		int a=0,b=1,newterm=0;
		System.out.print(a+","+b);
		for(int i=2;i<n;i++)
		{
			newterm=a+b;
			a=b;
			b=newterm;
			System.out.print(","+newterm);			
		}
	}
}

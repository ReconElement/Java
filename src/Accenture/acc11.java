package Accenture;
import java.util.Scanner;
public class acc11 {
	public static int maxExponents(int a,int b)
	{
		int exp=1,max=0;
		for(int i=a;i<=b;i++)
		{
			exp=exp*2;
			if(exp>max && exp>=a && exp<=b)
				max=exp;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to get the largest exponent of 2 found between them: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int exp=maxExponents(a,b);
		System.out.println(exp);
	}
}

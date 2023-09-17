package Accenture;
import java.util.Scanner;
public class acc9 {
	public static int numberOfCarries(int num1,int num2)
	{
		int carcount=0;
		int rem=0;
		int add=0;
		while(num1!=0 || num2!=0)
		{
			rem=(num1%10)+(num2%10);
			if(rem/10!=0)
				carcount++;
			add=(num1%10)+(num2%10);
			num1=num1/10;
			num2=num2/10;
		}
		
		return carcount;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number to add: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number to add: ");
		int b=sc.nextInt();
		System.out.println(numberOfCarries(a,b));
	}
}

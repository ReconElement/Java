package Accenture;
import java.util.Scanner;
public class commondigit {
	public static int countCommon(int sam,int d1,int d2,int d3)
	{int count=0;
		int rem1=0, rem2=0, rem3=0;
		for(int i=0;i<3;i++)
		{
			rem1=d1%10;
			rem2=d2%10;
			rem3=d3%10;
			d1=d1/10;
			d2=d2/10;
			d3=d3/10;
			if(rem1%sam==0 || rem2%sam==0 || rem3%sam==0)
				count++;
		}
		return count;
	}
	public static int commonDigit(int a,int b,int c)
	{int common=0;
		for(int i=1;i<10;i++)
		{
			if(countCommon(i,a,b,c)==3)
				common=i;
		}
		return common;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers to find the common digit in all of them: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int common=commonDigit(a,b,c);
		System.out.println(common);
	}
}




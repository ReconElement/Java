package Accenture;
import java.util.Scanner;
public class acc6 {
	public static int differenceOfSum(int m,int n)
	{
		int sumnotdiv=0;
		int sumdiv=0;
		for(int i=0;i<=m;i++)
		{
			if(i%n==0)
				sumdiv=sumdiv+i;
			if(i%n!=0)
				sumnotdiv=sumnotdiv+i;
		}
		int ans=sumnotdiv-sumdiv;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want your sum: ");
		int m=sc.nextInt();
		System.out.println("Enter the number you want your elements to get divided by: ");
		int n=sc.nextInt();
		int ans=differenceOfSum(m,n);
		System.out.println(ans);
	}
}

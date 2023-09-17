package Accenture;
import java.util.Scanner;
public class AccAss1 {
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	public static int SumPrimeIndices(int[] arr, int n)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=1)
				if(isPrime(i)==true)
					sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int ans=SumPrimeIndices(arr,len);
		System.out.println(ans);
	}
}

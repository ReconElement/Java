package Accenture;
import java.util.Scanner;
public class geek2 {
	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int r=arr[j];
					arr[j]=arr[i];
					arr[i]=r;
				}
			}
		}
		return arr;
	}
	public static boolean findNumber(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]==n)
			{
				return true;
			}
		return false;
	}
	public static int missingNumber(int[] arr,int n)
	{
		int miss=0;
		int max=n;
		int min=1;
		for(int i=min;i<=max;i++)
		{
			if(findNumber(arr,i)==false)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range you want for your array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]= new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(missingNumber(arr,n));
	}
}

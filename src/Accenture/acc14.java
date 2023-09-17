package Accenture;
import java.util.Scanner;
public class acc14 {
	public static int max(int[] arr)
	{
	int max_idx=0;
	int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_idx=i;
			}
		}
		return max_idx;
	}
	public static int ProductOfSums(int[] arr, int n)
	{
		int asc=0,desc=0;
		int max_idx=max(arr);
		for(int i=0;i<=max_idx;i++)
		{
			asc=asc+arr[i];
		}
		for(int i=max_idx;i<arr.length;i++)
		{
			desc=desc+arr[i];
		}
		int product = desc*asc;
		return product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Product: "+(ProductOfSums(arr,n)));
	}
}

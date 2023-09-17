package Accenture;
import java.util.Scanner;
public class acc7 {
	public static int[] bubbleSort(int[] arr)
	{
		int r=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					r=arr[j];
					arr[j]=arr[i];
					arr[i]=r;
				}
			}
		}
		return arr;
	}
	public static int ProductSmallestPair(int sum,int[] arr)
	{
		int prod=0;
		arr=bubbleSort(arr);
			if(arr[0]+arr[1]<=sum)
			{
				prod=arr[0]*arr[1];
			}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int length=sc.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be compared with sum and product of two distinct elements: ");
		int sum=sc.nextInt();
		int ans=ProductSmallestPair(sum,arr);
		System.out.println(ans);
	}
}

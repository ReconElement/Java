package Accenture;
import java.util.Scanner;
public class acc1 {
	public static int[] bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int r=arr[i];
					arr[i]=arr[j];
					arr[j]=r;
				}
			}
		}
		return arr;
	}
	public static int LargeSmallSum(int[] arr,int length)
	{int odd_idx=0;
		int[] even=new int[arr.length];
		int[] odd= new int[arr.length];
		for(int i=0;i<arr.length;i=i+2)
		{
			even[i]=arr[i];
		}
		for(int i=1;i<arr.length;i=i+2)
		{
			odd[i]=arr[i];
		}
		even=bubbleSort(even);
		odd=bubbleSort(odd);
			for(int i=odd.length-1;i>=0;i--)
			{
				if(odd[i]!=0)
				{
					odd_idx=i;
					break;
				}
			}
		int sum=even[1]+odd[odd_idx-1];
			return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length=sc.nextInt();
		System.out.println("Enter the elements of your array: ");
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=LargeSmallSum(arr,length);
		System.out.println(sum);
	}
}

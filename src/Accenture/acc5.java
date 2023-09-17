package Accenture;
import java.util.Scanner;
public class acc5
{
	public static int findCount(int[] arr,int length,int num,int diff)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(Math.abs(arr[i]-num)<=diff)
				count++;
		}
		if(count>=1)
			return count;
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find the difference of: ");
		int num=sc.nextInt();
		System.out.println("Enter the number the individual differences must exceed: ");
		int diff=sc.nextInt();
		int count=findCount(arr,length,num,diff);
		System.out.println(count);
	}
}

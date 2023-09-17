package Accenture;
import java.util.Scanner;
public class bubble_sort {
	public static int[] bubbleSort(int arr[],int len)
	{
		int rough=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					rough=arr[j];
					arr[j]=arr[i];
					arr[i]=rough;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array you want: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] sorted_array=bubbleSort(arr,len);
		for(int i=0;i<sorted_array.length;i++)
			System.out.println(sorted_array[i]);
	}
}

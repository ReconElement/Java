package Accenture;
import java.util.Scanner;
public class selection_sort {
	public static int[] selectionSort(int[] arr,int len)
	{int small=0;
		for(int i=0;i<arr.length-1;i++)
		{
			small=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[small])
				{
					int temp=arr[small];
					arr[small]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int len=sc.nextInt();
		System.out.println("Enter the elements of your array: ");
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sorted_arr[]=selectionSort(arr,len);
		for(int i=0;i<sorted_arr.length;i++)
			System.out.println(sorted_arr[i]);
	}
}

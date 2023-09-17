package Accenture;
import java.util.Scanner;
public class geek1 {
	public static int[] array_sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int rough=arr[j];
					arr[j]=arr[i];
					arr[i]=rough;
				}
			}
		}
		return arr;
	}
	public static int[] largestSubarrayZero(int[] arr, int len)
	{	int[] narr = new int[arr.length];
		arr=array_sort(arr);
		int count=arr[0];
		narr[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			count=count+arr[i];
			narr[i]=arr[i];
			if(count==0)
			{
				break;
			}
		}
		return narr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int len=sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int subarr[] = largestSubarrayZero(arr, len);
		for(int i=0;i<subarr.length;i++)
			System.out.println(subarr[i]);
	}
}

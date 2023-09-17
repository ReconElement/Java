package Accenture;
import java.util.Scanner;
public class revArray {
	public static int[] RevArray(int[] arr)
	{ 
		int[] rev=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[j]=arr[i];
			j++;
		}
		arr=rev;
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array to get it's reverse: ");
		int num=sc.nextInt();
		System.out.println("Enter the array elements you want in your array: ");
		int[] arr = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] rev=RevArray(arr);
		for(int i=0;i<rev.length;i++)
			System.out.println(rev[i]);
	}
}

package Accenture;
import java.util.Scanner;
public class subArraySum {
	public static void subSum(int[] arr,int subsum)
	{
		int sub,start=0,end=0;
		for(int j=0;j<arr.length-1;j++)
		{
			sub=0;
			for(int i=j;i<arr.length;i++)
			{
				sub=sub+arr[i];
				if(sub==subsum)
				{
					start=j;
					end=i;
					break;
				}
			}
		}
		System.out.println("The sum is found in the subarray between "+start+" position and "+end+" position(including them)");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int num=sc.nextInt();
		System.out.println("Enter the elements into your array: ");
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sub array sum number: ");
		int subsum=sc.nextInt();
		subSum(arr,subsum);
	}
}

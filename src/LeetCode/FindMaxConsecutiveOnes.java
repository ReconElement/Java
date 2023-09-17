package LeetCode;
import java.util.*;
public class FindMaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] num)
	{
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==1)
			{
				if(max<countOne(num,i))
				{
					max=countOne(num,i);
				}
			}
		}
		return max;
	}
	public static int countOne(int[] num, int pos)
	{
		int len=0;
		for(int i=pos;i<num.length;i++)
		{
			if(num[i]==1)
				len++;
			if(num[i]==0)
				break;
		}
		return len;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of 1s and 0s you want in your binary array: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println(findMaxConsecutiveOnes(num));
	}
}

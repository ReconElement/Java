package LeetCode;
import java.util.*;
public class Rotate {
	public static void rotate(int[] nums,int k)
	{
		int ele=0;
		for(int i=0;i<k;i++)
		{
			ele=nums[nums.length-1];
			nums=shift(nums);
			nums[0]=ele;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(i==0)
			{
				System.out.print("["+nums[i]+",");
			}
			if(i==nums.length-1)
			{
				System.out.print(nums[i]+"]");
			}
			if(i!=0 && i!=nums.length-1)
				System.out.print(nums[i]+",");
		}
	}
	public static int[] shift(int[] nums)
	{
		int[] newr = new int[nums.length];
		for(int i=0;i<nums.length-1;i++)
		{
			newr[i+1]=nums[i];
		}
		return newr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in your array: ");
		int n=sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Enter the rotation steps: ");
		int k=sc.nextInt();
		rotate(nums,k);
	}
}

package LeetCode;
import java.util.Scanner;
public class solution1 {
	public int[] twosum(int[] nums, int target)
	{
		int arr[]=new int[] {};
		System.out.println(nums.length);
		int l=nums.length;
		for(int i=0;i<l-1;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.println(j);
				if(i<j && nums[i]+nums[j]==target)
				{
					arr[0]=i;
					arr[1]=j;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[] {2,7,11,15};
		solution1 obj= new solution1();
		int target=9;
		int arr1[]=obj.twosum(arr,target);
		System.out.println(arr1);
		
	}

}

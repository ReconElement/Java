package DataStructure;

public class backtracking2 {
	public static void k_string(int n, int[] arr, int k)
	{
		if(n<1)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else {
			for(int j=0;j<k;j++)
			{
				arr[n-1]=j;
				k_string(n-1,arr,k);
			}
		}
	}
	public static void main(String[] args) {
		int n=2;
		int[] arr = new int[n];
		int k=90;
		k_string(n,arr,k);
	}
}

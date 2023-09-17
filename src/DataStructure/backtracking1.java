package DataStructure;

public class backtracking1 {
	public static void binary(int n, int[] arr)
	{
		if(n<1)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else {
			arr[n-1]=0;
			binary(n-1, arr);
			arr[n-1]=1;
			binary(n-1, arr);
		}
	}
	public static void main(String[] args) {
		int n=2;
		int[] arr = new int[n];
		binary(n,arr);
	}
}

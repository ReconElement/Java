package DataStructure;
import java.util.*;
public class recursion3 {
	public static int isArraySorted(int[] arr, int index)
	{
		if(arr.length==1)
			return 1;
		return (arr[index-1]<arr[index-2])?0:isArraySorted(arr,index-1);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		isArraySorted(arr,i)
	}
}

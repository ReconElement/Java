package Accenture;
import java.util.*;
public class p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		List<Integer> arr = new ArrayList<Integer>();
		int x=0;
		while(true)
		{
			x=sc.nextInt();
			if(x>=0)
			{
				arr.add(x);
			}
			else
				break;
		}
		for(int i=arr.size()-1;i>=0;i--)
		{
			System.out.println(arr.get(i));
		}
	}
}

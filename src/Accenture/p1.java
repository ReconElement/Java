package Accenture;
import java.util.*;
public class p1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> arr = new ArrayList<>();
		System.out.println("");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int sumcol=0;
		for(int i=0;i<row;i++)
		{
			List<Integer> rows=new ArrayList<>();
			for(int j=0;j<col;j++)
			{
				int x=sc.nextInt();
				rows.add(x);
			}
			System.out.println();
			arr.add(rows);
		}
		
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				sumcol=arr.get(i).get(j)+sumcol;
			}
			System.out.println(sumcol);
			sumcol=0;
		}
	}
}
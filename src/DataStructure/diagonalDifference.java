package DataStructure;
import java.util.*;
public class diagonalDifference {
	public static int diagonalDiff(List<List<Integer>> arr)
	{
		int rowcol=arr.size();
		int sumr=0;
		int suml=0;
		int col=rowcol-1;
		for(int row=0;row<rowcol;row++)
		{
			sumr=arr.get(row).get(col)+sumr;
			col--;
		}
		col=0;
		for(int row=0;row<rowcol;row++)
		{
			suml=arr.get(row).get(col)+suml;
			col++;
		}
		int ans=Math.abs(suml-sumr);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns in your matrix: ");
		int rowcol=sc.nextInt();
		System.out.println("Enter your array elements: ");
		List<List<Integer>> arr=new ArrayList<>();
		for(int i=0;i<rowcol;i++)
		{
			List<Integer> rows=new ArrayList<>();
			for(int j=0;j<rowcol;j++)
			{
				int ele=sc.nextInt();
				rows.add(ele);
			}
			arr.add(rows);
		}
		int ans=diagonalDiff(arr);
		System.out.println(ans);
	}
}

package DataStructure;
import java.util.*;
public class twoDimension {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> arr= new ArrayList<>();
		System.out.println("Enter the number of rows you want: ");
		int row=sc.nextInt();
		System.out.println("Enter the number of coloumns you want: ");
		int col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			List<Integer> rows=new ArrayList<>();
			for(int j=0;j<col;j++)
			{
				int x=sc.nextInt();
				rows.add(x);
			}
			arr.add(rows);
		}
		System.out.println(arr);
		System.out.println("Enter the row and coloumn of the specified element you want: ");
		int row_s=sc.nextInt();
		int col_s=sc.nextInt();
		System.out.println(arr.get(row_s).get(col_s));
	}
}

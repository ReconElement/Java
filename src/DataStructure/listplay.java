package DataStructure;
import java.util.*;
public class listplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<>();
		System.out.println("Enter the number of rows you want in your list: ");
		int row=sc.nextInt();
		System.out.println("Enter the number of coloumns you want in your list: ");
		int col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the element: ");
				int con=sc.nextInt();
				list.addAll(0, list);
			}
		}
		System.out.println(list);
	}
}

package Accenture;
import java.util.*;
public class p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int row=sc.nextInt();
		int col=sc.nextInt();
		int colsum=0;
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				colsum =arr[j][i]+colsum;
			}
			System.out.println(colsum);
			colsum=0;
		}
	}
}

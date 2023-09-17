package Accenture;
import java.util.Scanner;
public class longestCommonPrefix {
	public static String prefix(String[] st)
	{
		char same=st[0].charAt(0);
		String prefix="";
		int count=0;
		int shortest_string=st[1].length();
		for(int i=0;i<st.length;i++)
		{
			if(st[i].length()<=shortest_string)
			{
				shortest_string=st[i].length();
			}
		}
		for(int i=0;i<shortest_string;i++)
		{
			for(int j=0;j<st.length;j++)
			{
				if(st[j].charAt(i)==same)
					count++;
				else
					break;
			}
			if(count==st.length)
			{
				same=st[0].charAt(i);
				prefix=prefix+same;
			}
		}
		prefix=prefix.substring(0, shortest_string);
		return prefix;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings you want in your strings array: ");
		int size=sc.nextInt();
		String[] st = new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the string: ");
			st[i]=sc.next();
		}
		System.out.println(prefix(st));
	}
}


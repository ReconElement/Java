package LeetCode;
import java.util.Scanner;
public class trial {
		public static void main(String[] args) {
			char ch[]=new char[100];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string to count it's characters: ");
			String s=sc.nextLine();
			System.out.println(s.length());
			char st[]=s.toCharArray();
			for(int i=0;i<s.length();i++)
			{
				ch[i]=s.charAt(i);
				System.out.println(s.charAt(i));
			}
	}
}

package LeetCode;
import java.util.Scanner;
public class charcount {
	private int count(String st, char ch)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	private boolean isFoundAfterIndex(String st, int idx, char ch)
	{
		for(int i=idx;i<st.length();i++)
		{
			if(st.charAt(i)==ch)
				return true;
		}
		return false;
	}
	
	public String char_count(String s, char rep)
	{
		char[] ch = new char[200];
		int[] chc = new int[200];
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			char chr=s.charAt(i);
			if(count(s,chr)>=1)
			{
				ch[i]=chr;
				chc[i]=count(s,chr);
			}
		}
		for(int i=0;i<s.length();i++)
		{
				if(isFoundAfterIndex(s, i+1,s.charAt(i))==true)
				{
					continue;
				}
				else
					System.out.println(ch[i]+" is found "+chc[i]+" times.");
			}
		int max=chc[0];
		for(int i=0;i<s.length();i++)
		{
			if(chc[i]>max)
				s=s.replace(s.charAt(i), rep);
		}
		return s;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to count it's characters: ");
		String s=sc.nextLine();
		System.out.println("Enter the character to replace with: ");
		char ch=sc.next().charAt(0);
		charcount obj = new charcount();
		String replaced=obj.char_count(s,ch);
		System.out.println(replaced);
	}
}

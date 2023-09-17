package Accenture;
import java.util.Scanner;
public class charReplace {
	public static String CharacterReplaced(String s,char rep)
	{
		int[] size = new int[200];
		int a=(int)'a';
		int z=(int)'z';
		int max=size[a];
		char max_char='a';
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>a && (int)s.charAt(i)<z)
			{
				size[(int)s.charAt(i)]++;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>a && (int)s.charAt(i)<z)
			{
				if(size[(int)s.charAt(i)]>max)
				{
					max=size[(int)s.charAt(i)];
					max_char=s.charAt(i);
				}
			}
		}
		s=s.replace(max_char, rep);
		return s;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find the highest repeated character: ");
		String s= sc.nextLine();
		System.out.println("Enter character to replace with: ");
		char ch=sc.next().charAt(0);
		System.out.println(CharacterReplaced(s,ch));
	}
}

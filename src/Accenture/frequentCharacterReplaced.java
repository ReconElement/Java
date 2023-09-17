package Accenture;
import java.util.Scanner;
public class frequentCharacterReplaced {
	public static String ifrequentCharacterReplaced(String s, char rev)
	{
		
		int[] size = new int[100];
		int a=Character.getNumericValue('a');
		int z=Character.getNumericValue('z');
		int max=size[a];
		char max_char='a';
		for(int i=0;i<s.length();i++)
		{
			if(Character.getNumericValue(s.charAt(i))>=a && Character.getNumericValue(s.charAt(i))<=z)
			{
				size[Character.getNumericValue(s.charAt(i))]++;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(Character.getNumericValue(s.charAt(i))>=a && Character.getNumericValue(s.charAt(i))<=z)
			{
				if(size[Character.getNumericValue(s.charAt(i))]>max)
				{
					max=size[Character.getNumericValue(s.charAt(i))];
					max_char=s.charAt(i);
				}
			}
		}
		s=s.replace(max_char, rev);
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find the highest repeated character: ");
		String s= sc.nextLine();
		System.out.println("Enter character to replace with: ");
		char ch=sc.next().charAt(0);
		System.out.println(ifrequentCharacterReplaced(s,ch));
	}
}

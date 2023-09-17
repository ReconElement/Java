package Accenture;
import java.util.Scanner;
public class acc10 {
	public static String replaceCharacter(String str,char ch1, char ch2)
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch1)
			{
				rev=rev+ch2;
			}
			if(str.charAt(i)==ch2)
			{
				rev=rev+ch1;
			}
			if(str.charAt(i)!=ch2 && str.charAt(i)!=ch1)
			{
				rev=rev+str.charAt(i);
			}
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("Enter a character: ");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter a character: ");
		char ch2=sc.next().charAt(0);
		System.out.println(replaceCharacter(s,ch1,ch2));
	}
}


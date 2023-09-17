package Accenture;
import java.util.Scanner;
public class acc4 {
	public static int CheckPassword(String str)
	{
		if(str.length()<4)
			return 0;
		if(str.charAt(0)-'0'>=0 && str.charAt(0)-'0'<=9)
			return 0;
		int numcount=0;
		int capcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' || str.charAt(i)=='/')
				return 0;
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				capcount++;
			if(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9)
				numcount++;
		}
		if(numcount<=0)
			return 0;
		if(capcount<=0)
			return 0;
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(CheckPassword("aA1_67"));
		System.out.println(CheckPassword("a987 abC012"));
	}
}

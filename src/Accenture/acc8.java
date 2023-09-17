package Accenture;
import java.util.Scanner;
public class acc8 {
	public static String moveHyphen(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='-')
				res=str.charAt(i)+res;
			else
				res=res+str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to displace all its hyphens to the front: ");
		String s=sc.nextLine();
		String ans=moveHyphen(s);
		System.out.println(ans);
	}
}

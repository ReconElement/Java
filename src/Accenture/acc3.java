package Accenture;
import java.util.Scanner;
public class acc3 {
	public static int OperationsBinaryString(String str)
	{int value=0;
	if(str.charAt(0)=='0')
		value=0;
	if(str.charAt(1)=='1')
		value=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A')
			{
				if(str.charAt(i+1)=='0')
					value=value & 0;
				if(str.charAt(i+1)=='1')
					value=value & 1;
			}
			
			if(str.charAt(i)=='B')
			{
				if(str.charAt(i+1)=='0')
					value=value | 0;
				if(str.charAt(i+1)=='1')
					value=value | 1;
			}
			if(str.charAt(i)=='C')
			{
				if(str.charAt(i+1)=='0')
					value=value ^ 0;
				if(str.charAt(i+1)=='1')
					value=value ^ 1;
			}
			System.out.println(value);
		}
		return value;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="1C0C1C1A0B1";
		int val=OperationsBinaryString(str);
		System.out.println(val);
	}
}

package Accenture;

public class pseudo {
	public static int funn(int a, int b)
	{
		if((b&a)<(a-b) && a>3)
		{
			b=b+3;
			b=a+3;
			b=(b+1)+a;
			return funn(a+1,b)+funn(a+b,b);
		}
		b=1+b+b;
		return b-a;
	}
	public static void main(String[] args) {
		int a=6;
		int b=3;
		funn(a,b);
		System.out.println(funn(a,b));
	}
}

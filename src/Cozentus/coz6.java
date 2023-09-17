package Cozentus;
import java.util.*;
public class coz6 {
	coz6()
	{
		System.out.println("Hello");
	}
	coz6(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		coz6 a=new coz6(3);
	}
}

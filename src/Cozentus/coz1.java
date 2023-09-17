/*Trying anonymous objects*/
package Cozentus;
import java.util.*;
public class coz1 {
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		new coz1().fact(5);
	}
}

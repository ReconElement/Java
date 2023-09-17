package DataStructure;
import java.util.*;
public class towersOfHanoi {
	public static void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg)
	{
		if(n==1)
		{
			System.out.println("Move disk 1 from peg "+frompeg+" to peg "+topeg);
			return;
		}
		//Move top n-1 disks from A to B, using C as auxillary
		TowersOfHanoi(n-1,frompeg,auxpeg,topeg);
		//Move remaining disks from A to C
		System.out.println("Move disks from peg "+frompeg+" to disk "+topeg);
		//Move n-1 disks from B to C using A as auxillary
		TowersOfHanoi(n-1,auxpeg,topeg,frompeg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks you want in your tower of Hanoi problem: ");
		int n=sc.nextInt();
		char a='a',b='b',c='c';
		TowersOfHanoi(n,a,b,c);	
	}
}

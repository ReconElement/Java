package DataStructure;
import java.util.Scanner;
public class recursion1 {
	public static void towersOfHanoi(int n, char source, char destination, char auxillary)
	{
		if(n==1) {
			System.out.println(" Move disk 1 from "+source+" to "+destination);
			return;
		}
		//Move top n-1 disk from A to B using C as auxillary
		towersOfHanoi(n-1, source, auxillary, destination);
		//Move remaining disks from A to C
		System.out.println(" Move disk "+n+" from disk "+source+" to disk "+destination);
		//Move n-1 disks from B to C using A as auxillary
		towersOfHanoi(n-1,auxillary,destination,source);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks you want in your tower of Hanoi problem: ");
		int n=sc.nextInt();
		char a='a';
		char b='b';
		char c='c';
		towersOfHanoi(n,a,c,b);
	}
}

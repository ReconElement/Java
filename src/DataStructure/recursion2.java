package DataStructure;
import java.util.Scanner;
public class recursion2 {
	public static void towerOfHanoi(int n, char source, char destination, char auxillary)
	{
		if(n==1)
		{
			System.out.println("The disk 1 is moved from "+source+" to "+destination);
			return;
		}
		towerOfHanoi(n-1, source, auxillary, destination);
		System.out.println("The disk "+(n)+" is moved from "+source+" to "+destination);
		towerOfHanoi(n-1, auxillary, destination, source);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks you want in your towers: ");
		int disk=sc.nextInt();
		towerOfHanoi(disk,'a','c','b');
	}
}

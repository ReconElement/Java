package Accenture;
import java.util.Scanner;
public class acc2 {
	public static int RelativeSpeed(int direction, int distance1, int time1, int distance2,int time2)
	{
		int relativespeed=0;
		int speed1=distance1/time1;
		int speed2=distance2/time2;
		if(direction==0)
		{
			relativespeed=speed1+speed2;
		}
		if(direction==1)
		{
			relativespeed=speed1-speed2;
		}
		return relativespeed;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("direction: ");
		int direction=sc.nextInt();
		System.out.println("distance1: ");
		int distance1=sc.nextInt();
		System.out.println("time1: ");
		int time1=sc.nextInt();
		System.out.println("distance2: ");
		int distance2=sc.nextInt();
		System.out.println("time2: ");
		int time2=sc.nextInt();
		int relativespeed=RelativeSpeed(direction, distance1, time1, distance2,time2);
		System.out.println(relativespeed);
	}
}

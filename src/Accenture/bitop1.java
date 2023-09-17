package Accenture;

public class bitop1 {
	public static void main(String[] args) {
		int a=9, b=8,c=20;
		System.out.println("Bitwise & operation a&b: "+(a&b));
		System.out.println("Bitwise exclusive ^ OR operation a^b: "+(a^b));
		System.out.println("Bitwise inclusive | OR operation a|b: "+(a|b));
		System.out.println("Bitwise complement ~ operation ~a: "+(~a));
		System.out.println("Bitwise >> signed right shift operation: a>>2: "+(a>>2));
		System.out.println("Bitwise << signed left shift operation: a<<2: "+(a<<2));
		System.out.println("Unsigned right shift operator: c>>>2: "+(c>>>2));
	}
}

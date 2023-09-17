/*Parametrized constructor example*/
package Cozentus;
import java.util.*;
public class coz4 {
	int id;
	String name;
	coz4(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(name+" "+id);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		coz4 a=new coz4(1,"Omkar Panda");
		coz4 b=new coz4(2,"Ashutosh Padhi");
		a.display();
		b.display();
	}
}

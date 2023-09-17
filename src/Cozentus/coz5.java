/*constructor overloading alonwith an example of copy constructor*/
package Cozentus;
import java.util.*;
public class coz5 {
	int id;
	String name;
	int roll;
	coz5(int id,String name,int roll)
	{
		this.id=id;
		this.name=name;
		this.roll=roll;
	}
	coz5(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	coz5(coz5 a)
	{
		id=a.id;
		name=a.name;
		roll=a.roll;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+roll);
	}
	static {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		coz5 a= new coz5(1,"Omkar Panda",24);
		coz5 b= new coz5(1,"Ashutosh Padhi");
		coz5 c= new coz5(b);
		a.display();
		b.display();
		c.display();
	}
}

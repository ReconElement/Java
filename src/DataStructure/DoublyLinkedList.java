package DataStructure;
import java.util.Scanner;
public class DoublyLinkedList {
	private DLLNode head;
	private DLLNode tail;
	private int length;
	public DoublyLinkedList()
	{
		head = new DLLNode(Integer.MIN_VALUE,null,null);
		tail = new DLLNode(Integer.MIN_VALUE,head,null);
		head.setNext(tail);
		length=0;
	}
	//Get the value at a given position
	public int get(int position)
	{
		return Integer.MIN_VALUE;
	}
	//Find the position of the head value that is equal to a given value 
	//equals() is used to determine equality instead of ==
	public int getPosition(int data)
	{
		//go looking for the data
		DLLNode temp=head;
		int pos=0;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				return pos;
			}
			pos++;
			temp=temp.getNext();
		}
		return Integer.MAX_VALUE;
	}
	//Return the current length of the DLL
	public int length()
	{
		return length;
	}
	//add a new value to the front of a list
	public void insert(int newValue)
	{
		DLLNode newNode = new DLLNode(newValue, null, head.getNext());
		newNode.getNext().setPrev(newNode);
		head=newNode;
		length++;
	}
	//add new values to the list at given position
	//all values from that position to the end move over to make space
	public void insert(int data, int position)
	{
		//fix the positions
		if(position<0)
			position=0;
		if(position>length)
			position=length;
		//if the list is empty make it the only element
		if(head==null)
		{
			head = new DLLNode(data);
			tail=head;
		}
		//if adding at the front of the list
		else if(position==0)
		{
			DLLNode temp = new DLLNode(data);
			temp.setNext(head);
			head=temp;
		}
		//else you have to find the correct position and enter
		else
		{
			DLLNode temp = head;
			for(int i=1;i<position;i++)
			{
				temp=temp.getNext();
			}
			DLLNode newNode = new DLLNode(data);
			newNode.next=temp.next;
			newNode.prev=temp;
			newNode.next.prev=newNode;
			temp.next=newNode;
		}
		length++;
	}
	//add a new value to the end of the list
	public void insertTail(int newValue)
	{
		DLLNode newNode = new DLLNode(newValue, tail.getPrev(),tail);
		newNode.getPrev().setNext(newNode);
		tail.setPrev(newNode);
		length++;
	}
	//remove the position at a given value
	//if the position is less than zero, remove the position at zero
	//if the position is more than length, remove the value at the last position
	public void remove(int position)
	{
		if(position<0)
			position=0;
		if(position>=length)
			position=length-1;
		if(head==null)
			return;
		//if removing the head element
		if(position==0)
		{
			head=head.getNext();
			if(head==null)
				tail=null;
		}
		//else go to the correct position and remove
		else
		{
			DLLNode temp=head;
			for(int i=1;i<position;i++)
			{
				temp=temp.getNext();
			}
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
		}
		length--;
	}
	//Remove a node matching a specified node in the list
	//use equals() instead of == to test for a matched node
	public synchronized void removeMatched(DLLNode node)
	{
		if(head==null)
			return;
		if(node.equals(head))
		{
			head=head.getNext();
			if(head==null)
				tail=null;
		}
		DLLNode p=head;
		while(p!=null)
		{
			if(p.equals(node))
			{
				p.prev.next=p.next;
				p.next.prev=p.prev;
				return;
			}
			p=p.getNext();
		}
	}
	//Remove the head value from the list and if the list is empty do nothing
	public int removeHead()
	{
		if(length==0)
			return Integer.MAX_VALUE;
		DLLNode save = head.getNext();
		head.setNext(save.getNext());
		save.getNext().setPrev(head);
		length--;
		return save.getData();
	}
	//remove the tail value from the list, if the list is empty do nothing
	public int removeTail()
	{
		if(length==0)
			return Integer.MAX_VALUE;
		DLLNode save=tail.getPrev();
		tail.setPrev(save.getPrev());
		save.getPrev().setNext(tail);
		length--;
		return save.getData();
	}
	//Return a string representation of the collection in the likes of ["str1","str2",...]
	public String toString()
	{
		String result="[]";
		if(length==0)
			return result;
		result="[ "+head.getNext().getData();
		DLLNode temp=head.getNext().getNext();
		while(temp!=tail) {
			result=result+","+temp.getData();
			temp=temp.getNext();
		}
		return result + "]";
	}
	//remove everything in the doubly linked list
	public void clearList()
	{
		head=null;
		tail=null;
		length=0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		char ch=' ';
		int num,i=0;
		while(true)
		{
			System.out.println("Enter y to insert a node, enter n to exit: ");
			ch=sc.next().charAt(0);
			if(ch=='y' || ch=='Y')
			{
				num=sc.nextInt();
				list.insert(num, i);
				i++;
			}
			else if(ch=='n'||ch=='N')
			{
				break;
			}
			else
				System.out.println("Invalid choice");
		}
		System.out.println(list.toString());
	}
}

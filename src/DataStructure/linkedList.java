package DataStructure;
import java.util.Scanner;
public class linkedList{
	//Implementation of a singly linked list
	public linkedList()
	{
		length=0;
	}
	ListNode head;//holds the head of the list
	private int length=0; //length of the linked list
	//Return the first node in the list
	public synchronized ListNode getHead()
	{
		return head;
	}
	//Insert a node at the beginning of the list
	public synchronized void insertAtBegin(ListNode node)
	{
		node.setNext(head);
		head=node;
		length++;
	}
	//Insert node at the end of the list
	public synchronized void enterAtEnd(ListNode node)
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
			ListNode p,q;
			for(p=head; (q=p.getNext())!=null;p=q);
			p.setNext(node);
		}
		length++;
	}
	//Add a new value to the list at a given position
	//All values at that position to the end move over to make space for it
	public void insert(int data, int position)
	{
		if(position<0)
			position=0;
		if(position>length)
			position=length;
		if(head==null)//if the list is empty make it be the only element
		{
			head=new ListNode(data);
		}
		//if adding at the front of the list
		else if(position==0)
		{
			ListNode temp = new ListNode(data);
			temp.next=head;
			head = temp;
		}
		//else find the correct position and enter
		else
		{
			ListNode temp=head;
			for(int i=1;i<position;i++)
			{
				temp=temp.getNext();
			}
			ListNode newNode = new ListNode(data);
			temp.next=newNode.next;
			temp.setNext(newNode);
		}
	length++;
	}
	//Remove and return the node at the head of the list
	public synchronized ListNode removeFromBegin()
	{
		ListNode node=head;
		if(node!=null)
		{
			head=node.getNext();
			node.setNext(null);
		}
		return node;
	}
	//Remove and return the node at the end of the linked list
	public synchronized ListNode removeFromEnd()
	{
		if(head==null)
			return null;
		ListNode p=head, q=null, next=head.getNext();
		if(next==null)
		{
			head.setNext(null);
			return p;
		}
		while((next=p.getNext())!=null)
		{
			q=p;
			p=next;
		}
		q.setNext(null);
		return p;
	}
	//remove a node matching the specified node in the list
	//use equals() instead of == to check for equality
	public synchronized void removeMatched(ListNode node)
	{
		if(head==null)//if the linked list is just empty, exit
			return;
		if(node.equals(head))//if the first element or the head node is equal to the node
		{
			head=head.getNext();
			return;
		}
		ListNode p=head, q=null;
		while((q=p.getNext())!=null)
		{
			if(node.equals(q))
			{
				p.setNext(q.getNext());
				return;
			}
			p=q;
		}
	}
	//Remove the node at a given position
	//If the position is less than zero, remove the node at position zero
	//if position is greater than the last position, remove the element at the last position
	public void remove(int position)
	{
		if(position<0)
			position=0;
		if(position>=length)
			position=length-1;
		//if nothing is there in the list, do nothing
		if(head==null)
			return;
		//if removing the head element
		if(position==0)
		{
			head=head.getNext();
			return;
		}
		//else advance to the correct position and remove
		else 
		{
			ListNode temp = head;
			for(int i=1;i<position;i++)
			{
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());//keep it for trial, picked from book but doubts arise in mind 
		}
		length--;
	}
	//Return a string representation of this collection {'str1','str2','str3'...}
	public String toString()
	{
		String result="|";
		if(head==null)//if the list is empty
			return result+" |";
		result = result + head.getData();
		ListNode temp = head.getNext();
		while(temp!=null)
		{
			result = result +", "+temp.getData();
			temp=temp.getNext();
		}
		result=result+" |";
		return result;
	}
	//Return the current length of the linked list
	public int length()
	{
		return length;
	}
	//Find the position of the first time a value occurs in a given linked list
	//use equals() to check equality instead of ==
	public int getPosition(int data)
	{
		ListNode temp=head;
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
			return Integer.MIN_VALUE;
	}
	//removing everything from the list
	public void clearList()
	{
		head=null;
		length=0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Implementing the linked list with functions
		ListNode x = new ListNode(1);
		linkedList list = new linkedList();
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
		System.out.println(list.removeFromEnd().getData());
	}
}

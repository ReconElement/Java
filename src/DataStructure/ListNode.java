package DataStructure;
import java.util.*;
public class ListNode {
	protected int data;
	protected ListNode next;
	public ListNode(int data)
	{
		this.data=data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public void setNext(ListNode next)
	{
		this.next=next;
	}
	public ListNode getNext() {
		return this.next;
	}
	public int ListLength(ListNode headNode)
	{
		int length=0;
		ListNode currentNode=headNode;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.getNext();
		}
		return length;
	}
	public static void main(String[] args) {
		ListNode x = new ListNode(1);
		ListNode y = new ListNode(2);
		ListNode z = new ListNode(3);
		x.setNext(y);
		y.setNext(z);
		System.out.println(x.ListLength(x));
	}
}
package LeetCode;
import java.util.*;
public class ReverseList {
	public static int reverseList(ListNode head)
	{
		int len=1;
		while(head.next!=null)
		{
			len++;
			head=head.next;
		}
		int a=0;
		ListNode[] x= new ListNode[len];
		for(int i=len-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				head=head.next;
				if(j==i)
				{
					x[a]=head;
					a++;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		ListNode c = new ListNode(3,null);
		ListNode b = new ListNode(2,c);
		ListNode a = new ListNode(1,b);
		System.out.println(reverseList(a));
	}
}

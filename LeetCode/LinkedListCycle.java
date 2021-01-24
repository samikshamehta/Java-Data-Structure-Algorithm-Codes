/*141. Linked List Cycle
 * Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.
 */
import java.util.Scanner;
class ListNode  
{
	     int val;
	     ListNode next;
	     public ListNode(int x)
	     {
	    	 this.val=x;
	    	 next=null;
	    	 
	     }
}
public class LinkedListCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ListNode head=null;
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			head=create(head,data);
		}
		printRec(head);
		System.out.println();
		boolean result=hasCycle(head);
		System.out.println(result);
	}
	public static ListNode create (ListNode head, int data)
	  {
	    if (head == null)
	      return new ListNode(data);
	    else {
	      head.next = create(head.next, data);
	      return head;
	    }
	  }
	static void printRec(ListNode head)
	{	
		if(head==null)
		{
			return;
		}
		System.out.print(head.val+"-->");
		printRec(head.next);
	}
	public static boolean hasCycle(ListNode head) 
	{
		ListNode slow=head;
		ListNode fast=head;
		if(head==null)
		{
			return false;
		}
		while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
	}
}

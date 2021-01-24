/*142. Linked List Cycle II
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

 */
import java.util.Scanner;
public class LinkedListCycleII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		ListNode result=detectCycle(head);
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
	public static ListNode detectCycle(ListNode head) 
	{
		ListNode slow=head;
		ListNode fast=head;
		ListNode temp=head;
		int count=0;
			while (fast != null && fast.next != null) 
			{
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) 
	            {
	               break;
	            }
			}
            if (fast == null || fast.next == null) 
            {
                return null;
            }
            while (temp != slow) 
            {
                temp = temp.next;
                slow=slow.next;
           
            }
            
            return temp;
	}
}

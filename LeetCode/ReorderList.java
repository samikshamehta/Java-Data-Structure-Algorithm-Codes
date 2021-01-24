import java.util.Scanner;

/*143. Reorder List
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example 1:

Given 1->2->3->4, reorder it to 1->4->2->3.
Example 2:

Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */
public class ReorderList {

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
		reorderList(head);

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
	public static void reorderList(ListNode head) 
	{
		ListNode tail=head;
		ListNode prev=null;
		int count=0;
        if(head!=null)
        {
    
			while(tail!=null)
			{
				tail=tail.next;
				count++;
			}
			if(count>1)
			{
				count=count/2;
				tail=head;
				while(count!=1)
				{
					tail=tail.next;
					count--;
				}
				ListNode temp=tail.next;
				tail.next=null;
				tail=temp;
				while(tail!=null)
				{
					temp=tail.next;
					tail.next=prev;
					prev=tail;
					tail=temp;
				}
				tail=prev;
				temp=head;
				while(temp!=null)
				{
					prev=temp;
					temp=temp.next;
					prev.next=tail;
					prev=tail;
					tail=tail.next;
					prev.next=temp;
				}
				if(tail!=null)
				{
					prev.next=tail;
				}
			}
        }
        printRec(head);
	}
}
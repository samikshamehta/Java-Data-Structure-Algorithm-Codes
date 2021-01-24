/*904. Fruit Into Baskets
 * In a row of trees, the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:

Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?

 

Example 1:

Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].
Example 2:

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].
Example 3:

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].
Example 4:

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.*/
import java.util.Scanner;
public class FruitIntoBaskets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result=totalFruit(arr);
		System.out.print(result);
	}
	 public static int totalFruit(int[] tree) 
	 {
		 int fruit=Integer.MIN_VALUE,count=0,i=0,j=0,value1=Integer.MIN_VALUE,value2=Integer.MIN_VALUE;
		 if(tree.length==0)
		 {
			 return 0;
		 }
		 if(tree.length==1)
		 {
			 return 1;
		 }
		 while(i<tree.length)
		 {
			 if(value1==Integer.MIN_VALUE)
			 {
				 value1=tree[i++];
				 count++;
			 }
			 else
			 {
				 if(value1!=Integer.MIN_VALUE && value1!=tree[i] && value2==Integer.MIN_VALUE)
				 {
					 j=i;
					 value2=tree[i++];
					 count++;
				 }
				 else
				 {
					 if(tree[i]==value1 || tree[i]==value2)
					 {
						 count++;
						 i++;
					 }
					 else
					 {
						value1=Integer.MIN_VALUE;
						value2=Integer.MIN_VALUE;
						count=0;
						i=j;
					 }
				 }
			 }
			 if(count>=fruit)
			 {
				 fruit=count;
			 }
		 }
	     return fruit;
	 }
}
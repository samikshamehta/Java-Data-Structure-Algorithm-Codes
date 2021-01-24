/*1004. Max Consecutive Ones III
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.

Return the length of the longest (contiguous) subarray that contains only 1s. 

 

Example 1:

Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
Example 2:

Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation: 
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.*/


import java.util.HashMap;
import java.util.Scanner;


public class MaxConsecutiveOnes {

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
		int k=s.nextInt();
		int result=longestOnes(arr,k);
		System.out.print(result);
	}
	public static int longestOnes(int[] A, int K) {
		int start=0,end=0,max=0,count=0;
		while(end<A.length && start<=A.length)
		{
			if(A[end]==0)
			{
				count++;
			}
			while(count>K)
			{
				if(A[start]==0)
				{
					count--;
				}
				start++;
			}
			max=Math.max(max, end-start+1);
			end++;
		}
		return max;
    }
}
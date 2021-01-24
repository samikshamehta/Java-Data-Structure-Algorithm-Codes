/*209. Minimum Size Subarray Sum
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.

Solution technique-Window Sliding*/

import java.util.Scanner;


public class MinimumSizeSubarraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int result=minSubArrayLen(k,arr);
		System.out.print(result+" ");
	}
	public static int minSubArrayLen(int s, int[] nums) 
	{
		int count=0,i=0,j=0,result=Integer.MAX_VALUE;
		if(nums.length==0)
		{
			return 0;
		}
		while(i<nums.length)
		{
			while(i<nums.length && count<s)
			{
				count+=nums[i++];
			}
			while(j<i && count>=s)
			{
					result=Math.min(result, i-j);
					count-=nums[j++];
			}
		}
		if(result==Integer.MAX_VALUE)
		{
			return 0;
		}
		return result;
	}		
}
/*
public int minSubArrayLen(int s, int[] nums) 
        {
		int sum=0,count=0,result=Integer.MAX_VALUE;
		if(nums.length==0)
		{
			return 0;
		}
		for(int j=0;j<nums.length;j++)
		{
			for(int i=j;i<nums.length;i++)
			{
				sum=sum+nums[i];
				count++;
				if(sum>=s && count<=result)
				{
					result=count;
					count=0;
					sum=0;
					break;
				}
			}
			count=0;
			sum=0;
		}
		if(result==Integer.MAX_VALUE)
		{
			return 0;
		}
		return result;
	}		
}
*/
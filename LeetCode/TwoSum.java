/*1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {

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
		int target=s.nextInt();
		int result[]=twoSum(arr,target);
		for(int j=0;j<result.length;j++)
		{
			System.out.print(result[j]+ " ");
		}
	}
	public static int[] twoSum(int[] nums, int target) 
	{
		HashMap<Integer,Integer>hash=new HashMap<>();
		ArrayList<Integer> Index=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(hash.containsKey(target-nums[i]))
			{
				Index.add(i);
				Index.add(hash.get(target-nums[i]));
			}
			else
			{
				hash.put(nums[i],i);
			}
		}
		int pointer[]=new int[Index.size()];
		for(int val=0; val<pointer.length;val++)
		{
			int value=Index.get(val);
			pointer[val]=value;
		}
		return pointer;
	}
}

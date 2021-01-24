/* 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ThreeSum {

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
		ArrayList<ArrayList<Integer>> result=threeSum(arr);
		for(int i=0;i<result.size();i++)
		{
				for(int j=0;j<result.get(i).size();j++)
				{
					System.out.print(result.get(j)+" ");
				}
				System.out.println();
		}
	}
	 public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) 
	 {
		 Arrays.sort(nums);
		 ArrayList<ArrayList<Integer>> tripletList = new ArrayList<>(); 
	     int previousRoot = Integer.MIN_VALUE;
	     for(int i=0;i<nums.length;i++)
	     {
	    	 int left = i+1;
	         int right = nums.length - 1;
	         int previous = Integer.MIN_VALUE;
	         while(left < right && nums[i] != previousRoot)
	         {
	        	 int sum = nums[i] + nums[left] + nums[right];
	             if(sum == 0 && nums[left] != previous)
	             {
	                	ArrayList<Integer> triplets = new ArrayList<>();
	                    triplets.add(nums[i]);
	                    triplets.add(nums[left]);
	                    triplets.add(nums[right]);
	                    tripletList.add(triplets);       
	                    previous = nums[left++];
	                    right--;
	              }
	             else if (sum > 0)
	                    right--;
	             	  else
	                    previous = nums[left++];
	                    
	            }
	            previousRoot = nums[i];
	     }
	        return tripletList;  
	    }
}
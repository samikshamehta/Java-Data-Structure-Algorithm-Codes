/*26. Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
*/

import java.util.Scanner;
public class RemoveDuplicatesfromSortedArray {

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
		int result=removeDuplicates(arr);
		System.out.println(result);
	}
	public static int removeDuplicates(int[] nums)
	{ 
		int i=0,j=1,temp=1;
		while(j<nums.length)
		{
			if(nums[i]==nums[j])
			{
				j++;
			}
			else
			{
				nums[temp]=nums[j];
				temp++;
				i++;
			}
		}
		return i+1;
	}
}

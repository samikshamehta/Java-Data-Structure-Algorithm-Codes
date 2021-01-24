/*80. Remove Duplicates from Sorted Array II
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.
 */
import java.util.Scanner;
public class RemoveDuplicatesfromSortedArrayII {

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
		int i=0,j=1,temp=1,count=0;
		while(j<nums.length)
		{
			if(nums[i]==nums[j])
			{
				if(count<1)
				{
					nums[temp]=nums[j];
					temp++;
					i++;
					count++;
				}
				j++;
			}
			else
			{
				nums[temp]=nums[j];
				temp++;
				i++;
				j++;
				count=0;
			}
		}
		return i+1;
	}
}

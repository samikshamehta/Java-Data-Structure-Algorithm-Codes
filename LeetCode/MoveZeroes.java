
/*283. Move Zeroes
*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements. */



import java.util.Scanner;


public class MoveZeroes {

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
		moveZeroes(arr);
	}
	static public void moveZeroes(int[] nums) {
		int i,k=0;
			for(i=0;i<nums.length;i++)
			  {
	            if(nums[i]!=0)
	            {
	                nums[k++]=nums[i];
	            }
	            else
	            {
	                int j=i+1,temp;
	                while(j<nums.length)
	                {
	                	if(nums[j]!=0)
	                	{
		                	temp=nums[k];
		                    nums[k++]=nums[j];
		                    nums[j]=temp;
		                    break;
	                	}
	                	else
	                	{
	                		j++;
	                	}
	                }
	            }
			  }			  
			for(i=0;i<nums.length;i++)
			{
				System.out.print(nums[i]+ " ");
			}
		}

	}
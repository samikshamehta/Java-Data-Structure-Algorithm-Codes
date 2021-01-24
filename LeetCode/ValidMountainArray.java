/*941. Valid Mountain Array 
 * Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]*/

import java.util.Scanner;
		
public class ValidMountainArray 
{

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
		boolean output=validMountainArray(arr);
		System.out.println(output);
	}
	 public static boolean validMountainArray(int[] A) 
	 {
		 boolean output=true;
		 int count0=0,count1=1;
		 if(A.length>=3)
		 {
			 for(int i=1;i<A.length;i++)
			 {
				 if(A[i]==A[i-1])
				 {
					 return false;
				 }
				 if(A[i]>A[i-1])
				 {
					 if(!output)
					 {
						 count1++;
					 }
					 output=true;
				 }
				 else
				 {
					 if(i>=2)
					 {
						 if(output)
						 {
							 count0++;
						 }
						 output=false;
					 }
					 else
					 {
						 break;
					 }
				 }
			}
			 if(count0==1 && count1==1)
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 else
			return false;
	 }
}
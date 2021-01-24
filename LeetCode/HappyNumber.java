/*202. Happy Number
 * Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HappyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		boolean result=isHappy(n);
		System.out.println(result);
	}
	public static boolean isHappy(int n) 
	{
		Set<Integer> set = new HashSet<>();
		set.add(n);
		while(n!=1)
		{
			int sum=0;
			while(n>0)
			{
				sum=sum+(n%10)*(n%10);
				n=n/10;
			}
			n=sum;
			if(set.contains(n))
			{
				return false;
			}
			set.add(n);
		}
		return true;
	}
}

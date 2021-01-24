/* 567. Permutation in String
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

 

Example 1:

Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input:s1= "ab" s2 = "eidboaoo"
Output: False
 */
import java.util.Scanner;
import java.util.HashMap;
public class PermutationinString 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		boolean result=checkInclusion(s1,s2);
		System.out.println(result);
	}
	public static boolean checkInclusion(String s1, String s2) {
		 HashMap<Character,Integer>hash=new HashMap<>();
			HashMap<Character,Integer>copy=new HashMap<>();
			int end=0,i=0,start=0;
		    while(i<s1.length())
			{
				if(!hash.containsKey(s1.charAt(i)))
				{
					hash.put(s1.charAt(i),0);
				}
				hash.put(s1.charAt(i), hash.get(s1.charAt(i))+1);
				i++;
			}
			copy.putAll(hash);
			while(end<s2.length() && start<s2.length())
			{
				if(!copy.containsKey(s2.charAt(end)))
				{
					end=start;
					start++;
					copy.putAll(hash);
					
				}
				else
				{
					copy.put(s2.charAt(end), copy.get(s2.charAt(end))-1);
					if(copy.get(s2.charAt(end))==0)
					{
						copy.remove(s2.charAt(end));
					}
					end++;
				}
	            if(copy.isEmpty())
				{
						return true;
				}
			}
			return false;
	    }
}
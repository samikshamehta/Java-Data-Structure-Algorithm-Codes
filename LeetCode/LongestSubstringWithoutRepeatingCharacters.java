/*3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

import java.util.HashMap;
import java.util.Scanner;
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		int result=lengthOfLongestSubstring(n);
		System.out.println(result);
	}
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character,Integer>hash=new HashMap<>();
		int max=0,start=0,end=0;
		while(end<s.length() && start<s.length())
		{
			if(hash.containsKey(s.charAt(end)))
			{
				start=Math.max(start,hash.get(s.charAt(end))+1);
				hash.put(s.charAt(end),end);
			}
			else
			{
				hash.put(s.charAt(end),end);
			}
			max=Math.max(max,end-start+1);
			end++;
		}
		return max;
	}
}
		/*HashMap<Character,Integer>hash=new HashMap<>();
		int result=0,count=0;
        for(int i=0;i<s.length();i++)
		{
        	if(result<s.length())
        	{
	        	for(int j=i;j<s.length();j++)
	    		{
		    		if(hash.containsKey(s.charAt(j)))
					{
		    			hash.clear(); 
						break;
					}
					else
					{
						hash.put(s.charAt(j),1);
						count++;
					}
	    		}
	        	if(count>=result)
	        	{
	        		result=count;
	        	}
	        	count=0;
        	}
        }
		return result;
    }
}*/
/* 438. Find All Anagrams in a String
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class FindAllAnagramsinaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		ArrayList<Integer> result=findAnagrams(s1,s2);
		System.out.println(result);
	}
	public static ArrayList<Integer> findAnagrams(String s, String p) 
	 {
		
		ArrayList<Integer> startIndex=new ArrayList<Integer>();
		p=sort(p);
		for(int i=0;i<=s.length()-p.length();i++)
		{
			String str=s.substring(i, i+p.length());
			if(p.equals(sort(str)))
			{
				startIndex.add(i);
			}
		}
		return startIndex;
	 }
	public static String sort(String str)
	{
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
	 /*public static ArrayList<Integer> findAnagrams(String s, String p) 
	 {
		 HashMap<Character,Integer>hash=new HashMap<>();
		 HashMap<Character,Integer>copy=new HashMap<>();
		 ArrayList<Integer> startIndex=new ArrayList<Integer>();
		 int i=0,start=0,end=0;
		 while(i<p.length())
		 {
			 if(!hash.containsKey(p.charAt(i)))
			 {
			 hash.put(p.charAt(i),0);
			 }
			 hash.put(p.charAt(i),hash.get(p.charAt(i))+1);
			 i++;
		 }
		 copy.putAll(hash);
		 while(end<s.length() && start<s.length())
		{
			if(!copy.containsKey(s.charAt(end)))
			{
					copy.putAll(hash);
					end=start;
					start++;
			}
			else
			{
				copy.put(s.charAt(end), copy.get(s.charAt(end))-1);
				if(copy.get(s.charAt(end))==0)
				{
					copy.remove(s.charAt(end));
				}
				if(copy.isEmpty())
				{
					startIndex.add(start);
				}
			}
			end++;
		}
		 return startIndex;
	 }
}*/
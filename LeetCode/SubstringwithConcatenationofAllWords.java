/*30. Substring with Concatenation of All Words
 *You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

 

Example 1:

Input:
  s = "barfoothefoobarman",
  words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
Example 2:

Input:
  s = "wordgoodgoodgoodbestword",
  words = ["word","good","best","word"]
Output: [] */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SubstringwithConcatenationofAllWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		int n=s.nextInt();
		String words[] = new String[n];
		for(int i=0;i<n;i++)
		{
			words[i]=s.next();
		}
		ArrayList<Integer> result=findSubstring(s1,words);
		System.out.println(result);

	}
		public static ArrayList<Integer> findSubstring(String s, String[] words) {
			ArrayList<Integer> startIndex=new ArrayList<Integer>();
			 HashMap<String,Integer>hash=new HashMap<>();
			 int i=0,start=0,matched=0,end=0,wordslength = 0;
			 if(words.length!=0)
			 {
				 wordslength=words[0].length()-1;
			 }
			 String str="";
			 while(i<words.length)
			{
					if(!hash.containsKey(words[i]))
					{
						hash.put(words[i],0);
					}
					hash.put(words[i], hash.get(words[i])+1);
					i++;
			}
			for(end=0;end<=s.length()-(words.length*(wordslength+1));end++)
			{
				start=end;
				while(start<start+words.length && start<s.length()-wordslength)
				{
					str=s.substring(start,start+wordslength+1);
					if(hash.containsKey(str))
					{
						if(hash.get(str)>0)
						{
							matched++;
							hash.put(str, hash.get(str)-1);
							start=start+wordslength+1;
							if(matched==words.length)
							{
								startIndex.add(end);
								while(start>end)
								{
									str=s.substring(start-wordslength-1, start);
									hash.put(str, hash.get(str)+1);
									matched--;
									start=start-wordslength-1;
								}
								break;
							}
						}
						else
						{
							while(start>end)
							{
								str=s.substring(start-wordslength-1, start);
								hash.put(str, hash.get(str)+1);
								matched--;
								start=start-wordslength-1;
							}
							break;
						}
					}
					else
					{
						while(start>end)
						{
							str=s.substring(start-wordslength-1, start);
							hash.put(str, hash.get(str)+1);
							matched--;
							start=start-wordslength-1;
						}
						break;
					}
				}
			}
			return startIndex;
	    }
	}
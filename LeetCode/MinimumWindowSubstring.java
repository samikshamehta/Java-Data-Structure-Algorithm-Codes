/* 76. Minimum Window Substring
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:
 
If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class MinimumWindowSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String t=s.nextLine();
		String result=minWindow(s1,t);
		System.out.println(result);
	}
	public static String minWindow(String s, String t) 
	{
		HashMap<Character,Integer>hash=new HashMap<>();
		int k=0,start=0,end=0,matched=0,minLength=s.length()+1;
		String window="";
		while(k<t.length())
		{
			if(!hash.containsKey(t.charAt(k)))
			{
				hash.put(t.charAt(k),0);
			}
			hash.put(t.charAt(k), hash.get(t.charAt(k))+1);
			k++;
		}
		while(end<s.length())
		{
			if(hash.containsKey(s.charAt(end)))
			{
				hash.put(s.charAt(end),hash.get(s.charAt(end))-1 );
				if(hash.get(s.charAt(end))>=0)
				{
					matched +=1;
				}	
			}
			while(matched==t.length())
			{
				if(minLength>end-start+1)
				{
					minLength=end-start+1;
					window=s.substring(start, end+1);
				}
				if(hash.containsKey(s.charAt(start)))
				{
					if(hash.get(s.charAt(start))==0)
					{
							matched -=1;
					}
					hash.put(s.charAt(start),hash.get(s.charAt(start))+1 );
				}
				start++;
			}
			end++;
		}
		return window;
	}
}
	/*public static String minWindow(String s, String t) 
	 {
		HashMap<Character,Integer>hash=new HashMap<>();
		HashMap<Character,Integer>copy=new HashMap<>();
		int i=0,left=0,right=0,flag=0;
		String window="";
		while(i<t.length())
		{
			if(!hash.containsKey(t.charAt(i)))
			{
				hash.put(t.charAt(i),0);
			}
			hash.put(t.charAt(i), hash.get(t.charAt(i))+1);
			i++;
		}
		copy.putAll(hash);
		while(right<s.length())
		{
			if(!copy.isEmpty())
			{
				if(copy.containsKey(s.charAt(right)))
				{
					copy.put(s.charAt(right), copy.get(s.charAt(right))-1);
					if(copy.get(s.charAt(right))==0)
					{
						copy.remove(s.charAt(right));
					}
				}
			}
			if(copy.isEmpty())
			{
				if(window=="")
				{
					window=s.substring(left, right+1);
					flag=1;
				}
				else
				{
					if(window.length()>s.substring(left,right+1).length())
					{
						window=s.substring(left, right+1);
						flag=1;
					}
				}
			}
			while(flag!=0)
			{
				copy.putAll(hash);
				while(left<=right)
				{
					if(!copy.isEmpty())
					{
						if(copy.containsKey(s.charAt(left)))
						{
							if(window.length()>s.substring(left,right+1).length())
							{
								window=s.substring(left, right+1);
								flag=0;
							}
						}
					}
					left++;
				}
			}
			right++;
		}
		return window;
	}
}
public static String minWindow(String s, String t) 
	 {
		 HashMap<Character,Integer>Freq=new HashMap<>();
		 HashMap<Character,Integer>FreqCopy=new HashMap<>();
		 int start=0,end=0,i=0,temp=0,count=0,max=Integer.MAX_VALUE;
		 String str="";
		 while(i<t.length())
		{
			if(!Freq.containsKey(t.charAt(i)))
			{
				Freq.put(t.charAt(i),0);
			}
			Freq.put(t.charAt(i), Freq.get(t.charAt(i))+1);
			i++;
		}
		FreqCopy.putAll(Freq);
		while(end<s.length())
		{
			if(Freq.containsKey(s.charAt(end)))
			{
				 if(FreqCopy.containsKey(s.charAt(end)))
				 {
					FreqCopy.put(s.charAt(end), FreqCopy.get(s.charAt(end))-1);
					if(FreqCopy.get(s.charAt(end))==0)
					{
						FreqCopy.remove(s.charAt(end));
					}
					count++;
					if(count==2)
					{
						temp=end;
					}
				 }
				 else
				 {
					 if(!FreqCopy.isEmpty())
					 {
						 start=temp;
						 end=temp;
						 FreqCopy.putAll(Freq);
						 FreqCopy.put(s.charAt(start), FreqCopy.get(s.charAt(start))-1);
						 if(FreqCopy.get(s.charAt(end))==0)
							{
								FreqCopy.remove(s.charAt(end));
							}
						 count=1;
					 }
				 }
			 }
			if(FreqCopy.isEmpty())
			{
				if(max>end-start+1)
				{
					max=end-start+1;
					str=s.substring(start, end+1);
				}
				if(end!=s.length())
				{
					 start=temp;
					 end=temp;
					 FreqCopy.putAll(Freq);
					 FreqCopy.put(s.charAt(start), FreqCopy.get(s.charAt(start))-1);
					 if(FreqCopy.get(s.charAt(end))==0)
						{
							FreqCopy.remove(s.charAt(end));
						}
					 count=1;
				}
			}
			 end++;
		 }
		return str;
    }
}*/
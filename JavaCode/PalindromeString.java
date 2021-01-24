import java.util.*;

class PalindromeString 
{
    
	public static void main(String args[] ) throws Exception 
	{
		/*
		scanner which can parse primitive types and strings using regular expressions
		Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
		A scanning operation may block waiting for input.
		Scanner is not safe for multithreaded use without external synchronization.
		*/
		
		Scanner s=new Scanner(System.in);
		String original= s.nextLine();
		int length= original.length();
		String reverse="";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		System.out.println(original);
		System.out.println(reverse);
	}
}
			
		
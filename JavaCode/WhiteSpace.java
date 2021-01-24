import java.util.*;
import java.io.*;

class WhiteSpace 
{
    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int number=input.length();
		int count=0,i,n;
		char character;
		for (i=0; i<number;i++)
		{
			character=input.charAt(i);
			n=(int)character;
			if(n==32)
			{
				count++;
			}
		}		
		System.out.println(count);
	}
}



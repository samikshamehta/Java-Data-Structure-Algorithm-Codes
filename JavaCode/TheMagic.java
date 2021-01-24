import java.util.*;
import java.io.*;
class TheMagic
{
  	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		long testcase=Long.parseLong(t);
		int i;
		long sum=0L;		
		for(i=0; i<testcase; i++)
		{
			String n=reader.readLine();
			long number=Long.parseLong(n);
			if(number>=0)
			{
				sum=((number/2)+(number%2));
			}
			System.out.println(sum);
		}
		
	}
}
	
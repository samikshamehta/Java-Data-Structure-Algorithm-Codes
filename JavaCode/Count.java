import java.util.*;
import java.io.*;
class Count 
{
  	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		for(int j=0;j<testcase;j++)
		{
			int count=0;
			String l=reader.readLine();
			int length=Integer.parseInt(l);
			String input = reader.readLine();
			for(int i=0;i<length;i++)
			{
				char c=input.charAt(i);
				if(Character.isDigit(c))
				{
					count++;
					if(i!=length-1)
					{
						if(Character.isDigit(input.charAt(i+1)))
						{
							count--;					
						}
					}
					else
					{
						break;
					}
				}
			}
		System.out.println(count);
		}
	}
}



import java.util.*;
import java.io.*;
class MicroandBinaryString
{
   public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		int i,j;
		long decimalValue;
		for(i=0;i<testcase;i++)
		{
			long count=0L;
			String n=reader.readLine();
			long number=Integer.parseInt(n);
			String c=reader.readLine();
			for(j=0;j<number;j++)
			{
				c = c.substring(1) + c.charAt(0);
				decimalValue = Integer.parseInt(c, 2);
				if(decimalValue%2!=0)
				{
					count++;
				}		
			}
			System.out.println(count);	
		}
	}
}
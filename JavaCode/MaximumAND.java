import java.util.*;
import java.io.*;
class MaximumAND
{
  	public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		long testcase=Long.parseLong(t);
		long[] value=new long[2];
		long i, k;
		int j;
		for(i=0;i<testcase;i++)
		{	long max=0;
			String val=reader.readLine();
			for(j=0;j<2 ;j++)
			{	
				String[] token = val.split(" "); 
				value[j]=Long.parseLong(token[j]);
			}
			for(k=value[0];k<value[1];k++)
			{
				if(max<=(k&(k+1)))
					{
						max=(k&(k+1));						
					}	
				
			}
			System.out.println(max);			
		}
	}
}
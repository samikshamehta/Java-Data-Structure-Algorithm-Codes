import java.util.*;
import java.io.*;
class Monkandtask
{
  	public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		int i,j,k,l;
		for(i=0;i<testcase;i++)
		{	
			String d=reader.readLine();
			int days=Integer.parseInt(d);
			String val=reader.readLine();
			long value[]=new long[days];
			int count[]=new int[days];
			long num;
			int max=0;
			for(j=0;j<days;j++)
			{	
				int ones=0;
				String[] token = val.split(" "); 
				value[j]=Long.parseLong(token[j]);
				num=value[j];
				while(num > 0)
				{
					if(num%2==1)
					{
						ones++;
					}
					num=num/2;
				}
				count[j]=ones;
				if(max<ones)
				{
					max=ones;
				}
			}
			for(k=0;k<=max;k++)
			{
				for(l=0;l<days;l++)
				if(count[l]==k)
					{
						System.out.print(value[l] + " ");							
					}	
				
			}
			System.out.println();
					
		}
	}
}
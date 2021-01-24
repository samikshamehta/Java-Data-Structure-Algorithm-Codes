import java.util.*;
import java.io.*;
class Lucky 
{
  	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		for(int i=0; i<testcase; i++)
		{
			String n=reader.readLine();
			long number=Long.parseLong(n);
			long sum= 0L,num;
			/*for(j=1;j<=number;j++)
			{
				int ones=0, num=j;
				while(num>0)
				{
					if(num%2==1)
					{
						ones++;
					}
					num=num/2;
				}
			}*/
			for(long j=1;j<=number;j++)
			{
				int ones=0;
				num=j;
				while(num>0)
				{
					num&=(num-1);
					ones++;
				}
				if(ones==2)
				{
					sum=((sum%1000000007)+(j%1000000007))%1000000007;
				}
			}
			System.out.println(sum);
		}
		
	}
}
	
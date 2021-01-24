import java.util.*;
import java.io.*;
class CrazyBits
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		long testcase=Long.parseLong(t);
		int i;
		for(i=1;i<=testcase;i++)
		{
			String n=reader.readLine();
			long number=Long.parseLong(n);
			if(number!=0)
			{
				System.out.println(number+1);
			}
		}
	}
	
}



import java.util.*;
import java.io.*;
class XOR
{
  	public static void main(String args[]) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int testcase= s.nextInt();
		int i,j,k,l;
		for(j=0;j<testcase;j++)
		{	int count=0,count1=0;
			long mul;
			int length=s.nextInt();
			long value[]=new long[length];
			for(i=0;i<length ;i++)
			{
				int str=s.nextInt();
				value[i]=str;
			}
			for(i=0;i<length;i++)
			{	
				if(value[i]%2==0)
				{
					count++;
				}
				if(value[i]%2!=0)
				{
					count1++;
				}
			}
			mul=count*count1;
			System.out.println(mul);
		}
	}
}
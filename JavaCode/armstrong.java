import java.io.*;

class armstrong 
{
    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i=0,count=0,mul=1,sum=0,digit;
		int val=N;
		while(N!=0)
		{
			N=N/10;
			count++;
		}
		N=val;	
		while(val!=0)
		{
			digit=val%10;
			val=val/10;
			while(i<count)
			{
				mul=mul*digit;
				i++;	
			}
			i=0;
			sum=sum+mul;
			mul=1;
		}
		if(N==sum)	
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}
				
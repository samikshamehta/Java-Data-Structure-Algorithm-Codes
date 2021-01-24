import java.util.*;

class PrimeNumber 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String Prime="";
		for(int i=2; i<n; i++)
		{
			int flag=1;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}	
			if(flag==1)
			{
				Prime=Prime+i+" ";	
			}
	
		}
		System.out.println(Prime);
	}
}
				
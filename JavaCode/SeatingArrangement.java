import java.util.*;

class SeatingArrangement 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int t= s.nextInt();
		int n[]= new int[t];
		int a[]= new int[108];
		String b[]=new String[108];
		String c[]= new String[] {"WS","MS","AS","AS","MS","WS"};
		int i,j,max;
		for(i=0;i<t;i++)
		{
			n[i]= s.nextInt();
		}
		max=n[0];
		for (i=1; i<t; i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
						
		}
		for (i=0; i<max+11; i++)
		{
			a[i]=i+1;
						
		}
		for (i=0; i<max+11;)
		{
			for(j=0;j<6;j++)
			{
				b[i]=c[j];
				i++;
				
			}
		}
		
	}
}
	




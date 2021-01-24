import java.io.*;
class pattern5
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i,j,k,l,m;
		for(i=0;i<((N+1)/2);i++)
		{
			if(i==0)
			{
				for(j=1;j<=N;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(k=1;k<=(((N+1)/2)-i);k++)
				{
					System.out.print("*");
				}
				for(l=1;l<=(i+(i-1));l++)
				{
					System.out.print(" ");
				}
				for(k=1;k<=(((N+1)/2)-i);k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();	
		}
		for(i=(((N+1)/2));i<(N-2);i++)
		{
			if(i==(N-2))
			{
				for(j=1;j<=N;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(k=i;k<=(N-2);k++)
				{
					System.out.print("*");
				}
				for(l=i;l<=1;l=l-2)
				{
					System.out.print(" ");
				}
				for(k=i;k<=(N-2);k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();	
		}
	}
}
					
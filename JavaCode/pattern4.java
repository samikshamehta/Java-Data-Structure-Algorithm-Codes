import java.io.*;
class pattern4
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i,j,k,x=0;
		for(i=1;i<=((N+1)/2);i++)
		{
				for(j=(((N+1)/2)+1);j>i;j--)
				{
					System.out.print(" ");
				}
				for(k=1;k<(i*2);k++)
				{
					System.out.print("*");
				}	
				System.out.println();	
		}
		//System.out.println(i);	
		for(i=((N+1)/2);i<=(N+1);i++)
			{
				for(j=(i-((N+1)/2));j>0;j--)
				{
					System.out.print(" ");
				}
				for(k=(2*((N-i)+1));k>=0;k--)
				{
					System.out.print("*");
				}
				System.out.println();	
			}
	}
}
					k
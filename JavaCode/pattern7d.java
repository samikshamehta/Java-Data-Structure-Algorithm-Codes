import java.io.*;
class pattern7d
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i,j,k=0;
		for(i=1;i<=N;i++)
		{
			if(i==1)
			{
				System.out.print("1");
			}
			else
			{
				for(j=1;j<=i;j++)
				{
					if(j==1||j==i)
					{
						System.out.print(k);
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			k++;
			System.out.println();
		}
	}
}
					
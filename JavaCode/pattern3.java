import java.io.*;
class pattern3
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i,j,k=N;
		for(i=1;i<=N;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k);
			}
			k--;
			System.out.println();
		}
	}
}
					
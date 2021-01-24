import java.io.*;

class pattern7f	
{
    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int row=1,col,i=N,X;
		while(row<=N)
		{
			col=1;
			while(col<=row)
			{
					System.out.print(i);
					col++;
			}
			System.out.println();
			row++;
			i--;
			
		}
	}
}
				
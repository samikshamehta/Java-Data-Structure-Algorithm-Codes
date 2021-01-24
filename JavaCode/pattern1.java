import java.io.*;

class pattern1 
{
    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int row=1,col=N,i,X;
		while(row<=N)
		{
			i=1;
			X=col;
			while(X!=0)
			{
					System.out.print(i);
					i++;
					X--;
			}
			col--;
			row++;
			System.out.println();
		}
	}
}
				
import java.io.*;
class TreeOfManyLeaves
{
	 public static void main(String args[]) throws Exception 
	{	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int T=Integer.parseInt(t);
		int i,j,k,l,m;
		for(i=0;i<T;i++)
		{
			String n=reader.readLine();
			int N=Integer.parseInt(n);
			int array[]=new int[N];
			String[] s = reader.readLine().split(" "); 
			for(j=0;j<N;j++)
			{
				array[j]=Integer.parseInt(s[j]);
			}
			if(N%2!=0)
			{
				for(m=0;m<=N/2;m++)
				{
					for(k=0,l=0;k<N;k=k+2,l++)
					{
						if(k+1==N)
						{
							array[l]=array[k];
						}
						else
						{
							array[l]=(array[k]^array[k+1]);
						}
						System.out.println(l+ " " +array[l]);
					}
				}
			}
			else
			{
				for(m=0;m<N/2;m++)
				{
					for(k=0,l=0;k<N;k=k+2,l++)
					{
						if(k+1==N)
						{
							array[l]=array[k];
						}
						else
						{
							array[l]=(array[k]^array[k+1]);
						}
						System.out.println(l+ " " +array[l]);
					}
				}
			}
			System.out.println(array[0]);
		} 				
	}
} 
		
import java.io.*;
class prog  
{
	 public static void main(String args[]) throws Exception 
	{	
		int i,j,k,l,d=0;
		for(i=0;i<4;i++)
		{
			for(j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(++d);
			}
			for(l=i;l>0;l--)
			{
				System.out.print(--d);
			}
			System.out.println();
		}
	}
}
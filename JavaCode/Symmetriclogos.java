import java.io.*;
class Symmetriclogos
{
   public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		for(int l=0;l<testcase;l++)
		{
			int i,j,length,flag=1;
			String n=reader.readLine();
			int sizeofmatrix=Integer.parseInt(n);
			int array[][]=new int[sizeofmatrix][sizeofmatrix];
			for(i=0;i<sizeofmatrix;i++)
			{
				String arr=reader.readLine();
				for(j=0;j<sizeofmatrix;j++)
				{
					array[i][j]=(int)arr.charAt(j)-(int)'0';
				}
			}
			length=sizeofmatrix-1;
			for(i=0;i<=(length/2);i++)
			{
				for(j=0;j<=(length/2);j++)
				{
					if((array[i][j]!=array[i][length-j])||(array[i][j]!=array[length-i][j])||(array[i][j]!=array[length-i][length-j]))
					{
						flag=0;
					}
					
				}
			}
			if(flag==0)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
} 
		
import java.io.*;
class MicroArrayUpadate
{
   public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		int i,j,l;
		for(i=0;i<testcase;i++)
		{
			String n=reader.readLine();
			int sizeofmatrix=Integer.parseInt(n);
			int array[][]=new int[sizeofmatrix][sizeofmatrix];
			String[] arr=reader.readLine().split(" ");
			int count=0;
			for(j=0;j<Integer.parseInt(val[0]);j++)
			{
				array[j]=Integer.parseInt(arr[j]);
			}
			for(j=0;j<Integer.parseInt(val[0]);j++)
			{
				while(array[j]<Integer.parseInt(val[1]))
				{
					for(l=0;l<Integer.parseInt(val[0]);l++)
					{
						array[l]=array[l]+1;
					} 
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
		
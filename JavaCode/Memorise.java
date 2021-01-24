import java.io.*;
class Memorise
{
   public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int number=Integer.parseInt(n);
		int array[]=new int[number];
		int i;
		String[] arr=reader.readLine().split(" ");
		for(i=0;i<number;i++)
		{
			
			array[i]=Integer.parseInt(arr[i]);
		}
		String q=reader.readLine();
		int query=Integer.parseInt(q);
		for(i=0;i<query;i++)
		{
			int count=0;
			String v=reader.readLine();
			int value=Integer.parseInt(v);
			for(int j=0;j<number;j++)
			{
				if(array[j]==value)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("NOT PRESENT");
			}
			else
			{
				System.out.println(count);
			}
		}
	}
}
		
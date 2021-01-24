import java.io.*;
class MicroArray
{
   public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		int i,j,l;
		for(i=0;i<testcase;i++)
		{
			String[] val=reader.readLine().split(" ");
			int length=Integer.parseInt(val[0]);
			int value=Integer.parseInt(val[1]);
			int array[]=new int[length];
			String[] arr=reader.readLine().split(" ");
			int count=0;
			for(j=0;j<length;j++)
			{
				array[j]=Integer.parseInt(arr[j]);
			}
			int min=array[0];
			for(j=1;j<length;j++)
			{
				if(min>=array[j])
				{
					min=array[j];
				}
			}
			count=value-min;
			if(count<=0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println(count);
			}
		}
	}
}
		
import java.io.*;
class PhilosophersStone  
{
	int push(int data,int array[],int top)
	{
		array[++top]=data;
		return top;
	}
	void pop(int array[],int top,int extra)
	{
		extra=array[top];
		array[top]=array[top-1];
		array[top-1]=extra;
	}
   public static void main(String args[]) throws Exception 
	{	
		PhilosophersStone f=new PhilosophersStone();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String t=reader.readLine();
		int testcase=Integer.parseInt(t);
		int i,j;
		for(i=0;i<testcase;i++)
		{
			int extra,top=-1;
			String[] s = reader.readLine().split(" "); 
			int noofpasses=Integer.parseInt(s[0]);
			int array[]=new int[noofpasses];
			int ids=Integer.parseInt(s[1]);
			top=f.push(ids,array,top);
			for(j=0;j<noofpasses;j++)
			{
				String[] v= reader.readLine().split(" "); 
				char c= v[0].charAt(0);
				if(c=='P')
				{
					int id=Integer.parseInt(v[1]);
					top=f.push(id,array,top);
				}
				else
				{	
					extra=0;
					f.pop(array,top,extra);
				}
			}
			System.out.println("Player" + " " + array[top]);
		}		
	}
} 
		
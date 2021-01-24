import java.io.*;
class PhilosophersStone
{
	int push(int data,int array[],int top)
	{
		array[++top]=data;
		System.out.println(array[top]+ " " +top);
		return top;
	}
	int pop(int array[],int top)
	{
		array[top]=0;
		System.out.println(array[top]+ " " +top);
		return --top;
	}
   public static void main(String args[]) throws Exception 
	{	
		PhilosophersStone f=new PhilosophersStone();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int array[]=new int[N];
		String[] s = reader.readLine().split(" "); 
		String val[]=reader.readLine().split(" "); 
		int Q=Integer.parseInt(val[0]);
		System.out.println(Q);
		int X=Integer.parseInt(val[1]);
		System.out.println(X);
		int j,top=-1,sum=0,data;
		for(j=0;j<Q;j++)
		{
			String v=reader.readLine();
			if(v=="Harry")
			{
				System.out.println(s[j]);
				data=Integer.parseInt(s[j]);
				System.out.println(data);
				top=f.push(data,array,top);
				System.out.println(array[top]+ " " +top);
			}
			else
			{
				if(top!=-1)
				{
					top=f.pop(array,top);
				}				
			}
		}
		for(j=0;j<=top;j++)
		{
			sum=sum+array[j];
		}
		if(sum==X)
		{
			System.out.println(top++);
		}
		else
		{
			System.out.println("-1"); 
		}				
	}
} 
		
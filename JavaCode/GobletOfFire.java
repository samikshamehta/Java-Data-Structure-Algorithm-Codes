import java.io.*;

class Nodes
{
	Nodes Previous;
	int data1, data2;
	Nodes Next;
	int enque(int array[][],int X,int Y,int front,int rear,int Q)
	{
		if(rear!=(Q-1))
		{
			
		}
		array[++top]=data;
		return top;
	}
	void pop(int array[],int top,int extra)
	{
		extra=array[top];
		array[top]=array[top-1];
		array[top-1]=extra;
	}
}
class GobletOfFire
{	
   public static void main(String args[]) throws Exception 
	{	
		Nodes N=new Nodes();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String q=reader.readLine();
		int Q=Integer.parseInt(q);
		int i,j,front=0,rear=0;
		int array[]=new int[Q];
		int array1[]=new int[Q];
		for(i=0;i<Q;i++)
		{
			String[] s = reader.readLine().split(" "); 
			char O=s[0].charAt(S[0]);
			int X=Integer.parseInt(s[1]);
			int Y=Integer.parseInt(s[2]);
			for(j=0;j<Q;j++)
	
				if(O=='E')
				{
					rear=G.enque(array,X,Y,front,rear,Q);
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
		
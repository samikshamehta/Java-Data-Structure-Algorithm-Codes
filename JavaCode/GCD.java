import java.io.*;
class GCD
{
	 public static void main(String args[]) throws Exception 
	{	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		int i=0,j=1,l;
		while(i<=N)
		{
			System.out.println(i);
			l=i;
			i=j;
			//System.out.println("i" +"" +i);
			j=l+j;
			//System.out.println("j" +" " +j);
		}
	}
}
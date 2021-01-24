import java.io.*;
class GCD1
{
	 public static void main(String args[]) throws Exception 
	{	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a=reader.readLine();
		int A=Integer.parseInt(a);
		String b=reader.readLine();
		int B=Integer.parseInt(b);
		int C;
		if(A>B)
		{
			C=A%B;
			if(B%C==0)
			{
				System.out.println(C);
			}
		}
		else
		{
			C=B%A;
			if(A%C==0)
			{
				System.out.println(C);
			}
		}
	}
}
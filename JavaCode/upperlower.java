import java.io.*;
class upperlower
{    
	public static void main(String args[]) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String c=reader.readLine();
		int C=(int)(c.charAt(0));
		if(C>=65 && C<=90)
		{
			System.out.println("Upper case letter");
		}
		else
		{
			if(C>=97 && C<=122)
			{
				System.out.println("Lower case letter");
			}
			else
			{
				System.out.println("Invalid character");
			}
		}
	}
}
				
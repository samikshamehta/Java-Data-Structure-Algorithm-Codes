import java.io.*;
class coordinates
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String x=reader.readLine();
		int X=Integer.parseInt(x);
		String y=reader.readLine();
		int Y=Integer.parseInt(y);
		int value;
		if(x%2==0 && y%2==0)
		{
			value=x+y;
		}
		else
		{
			value=(x+y)-1;
		}
		System.out.println(value);
}
					
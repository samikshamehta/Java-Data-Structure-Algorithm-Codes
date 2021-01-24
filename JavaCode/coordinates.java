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
		while(X>=Y)
		{
			if(X%2==0 && Y%2==0)
			{
				value=X+Y;
			}
			else
			{
				if(X%2!=0 && Y%2!=0)
				{
					value=((X+Y)-1);
				}
				else
				{
					break;
				}
			}
			System.out.println(value);
			break;
		}
	}
}					
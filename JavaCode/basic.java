import java.io.*;
class basic
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String x=reader.readLine();
		int basic=Integer.parseInt(x);
		String y=reader.readLine();
		char grade=y.charAt(0);
		int allow=0;
		int hra=(basic*20)/100;
		int da=(basic*50)/100;
		int pf=(basic*11)/100;
		if(grade=='A')
		{
			allow=1700;
		}
		else
		{
			if(grade=='B')
			{
				allow=1500;
			}
			else
			{
				if(grade=='C')
				{
					allow=1300;
				}
			}
		}
		int t_sal=basic+hra+da+allow-pf;
		System.out.println(t_sal);
	}
}					
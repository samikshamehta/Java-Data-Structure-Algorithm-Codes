import java.io.*;
class SimpleInterest
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String p=reader.readLine();
		int principle=Integer.parseInt(p);
		String r=reader.readLine();
		int rate=Integer.parseInt(r);
		String t=reader.readLine();
		int time=Integer.parseInt(t);
		int simpleinterest=(principle*rate*time)/100;
		System.out.println(simpleinterest);
	}
}
				
import java.io.*;

class calculator
{
    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a=reader.readLine();
		int A=Integer.parseInt(a);
		String b=reader.readLine();
		int B=Integer.parseInt(b);
		String c=reader.readLine();
		char C=c.charAt(0);
		switch(C)
		{
			case '+': System.out.println("Sum" +" " +(A+B));
					break;
			case '-': if(A>B)
					{
						System.out.println("Difference" +" " +(A-B));
					}
					else
					{
						System.out.println("Difference" +" " +(B-A));
					}
					break;
			case '*': System.out.println("Multiply" +" " +(A*B));
					break;
			case '/': if(A>B)
					{
						System.out.println("Divide" +" " +(A/B));
					}
					else
					{
						System.out.println("Divide" +" " +(B/A));
					}
					break;
			case '%': if(A>B)
					{
						System.out.println("Modula" +" " +(A%B));
					}
					else
					{
						System.out.println("Modula" +" " +(B%A));
					}
					break;			
		}
	}
}
				
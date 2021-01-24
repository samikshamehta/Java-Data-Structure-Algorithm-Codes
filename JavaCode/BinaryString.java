import java.util.*;
class BinaryString
{
    
	public static void main(String args[]) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int i,j,k, flag=1;
		long decimalValue;
		char char1;
		for(i=0;i<t;i++)
		{
			int count=0;
			int n=s.nextInt();
			s.nextLine();
			String c=s.nextLine();
			for(j=0;j<n;j++)
			{
				
				c = c.substring(1) + c.charAt(0);
				decimalValue = Integer.parseInt(c, 2);
				if(decimalValue%2==0)
				{
					count++;
				}
			}
			System.out.println(count);			
		}
	}
}
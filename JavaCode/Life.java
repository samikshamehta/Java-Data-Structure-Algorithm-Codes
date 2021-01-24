import java.util.*;
class Life 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt())
		{
			int val=s.nextInt();
			if(val==42)
			{
				break;
				
			}
			else
			{
				System.out.println(val);
			}
		
		}
	}
}
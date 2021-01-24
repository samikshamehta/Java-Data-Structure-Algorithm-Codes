import java.util.*;

class Factorial 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int number= s.nextInt();
		int fact=1;
		for(int i=number; i>0; i--)
		{
			
			fact=fact*i;
		}
		System.out.println(fact);
	}
}



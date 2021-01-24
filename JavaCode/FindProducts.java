import java.util.*;

class FindProducts
{
	public static void main (String args[]) throws Exception
	{
		Scanner s= new Scanner(System.in);	
		int n =s.nextInt();
		int a[]=new int[n];
		long multiply= 1L;
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
			multiply=((multiply*a[i])%(1000000007));
		}
	System.out.println(multiply);
	}
}
		
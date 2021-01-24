import java.util.Scanner;


public class pokeman 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int p=s.nextInt();
			int n=s.nextInt();
			int d=s.nextInt();
			int result=p+(n*(d-1));
			System.out.println(result);
		}
	}
}

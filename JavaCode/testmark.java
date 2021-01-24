import java.io.*;
class testmark
{    
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String no=reader.readLine();
		int No=Integer.parseInt(no);
		String n[]=reader.readLine().split(" ");
		String t1[]=reader.readLine().split(" ");
		String t2[]=reader.readLine().split(" ");
		String t3[]=reader.readLine().split(" ");
		int T1[]=new int[No];
		int T2[]=new int[No];
		int T3[]=new int[No];
		String N[]=new String[No];
		int sum=0,avg,i;
		for(i=0;i<No;i++)
		{
			N[i]=n[i];
			T1[i]=Integer.parseInt(t1[i]);
			T2[i]=Integer.parseInt(t2[i]);
			T3[i]=Integer.parseInt(t3[i]);
		}
		for(i=0;i<No;i++)
		{
			if(T1[i]<T2[i] && T1[i]<T3[i])
			{
				sum=sum+T2[i]+T3[i];
			}
			else
			{
				if(T2[i]<T3[i])
				{
					sum=sum+T1[i]+T3[i];
				}
				else
				{
					sum=sum+T1[i]+T2[i];
				}
			}
			avg=sum/2;
			System.out.println("Student Name"+ " " +N[i]+ " " +"Average of best two number"+ " " +avg);
			sum=0;
		}
	}
}
				
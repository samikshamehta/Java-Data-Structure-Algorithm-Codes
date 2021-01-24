import java.util.*;

class SeatingArrangements 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int t= s.nextInt();
		int n[]= new int[t];
		int a[][]= new int[18][6];
		String b[][]=new String[18][6];
		String c[]= new String[] {"WS","MS","AS","AS","MS","WS"};
		int i,j,value=0, flag=1, val1=0;
		for(i=0;i<t;i++)
		{
			n[i]= s.nextInt();
		} 
		for (i=val1; i<18; i++)
		{
			if(flag==1)
			{
				for(j=0;j<6;j++)
				{
					b[i][j]=c[j];
					value=value+1;
					a[i][j]=value;
					System.out.println(i);
					System.out.println(+j +" " +a[i][j]+ " " +b[i][j]);
					
				}
				flag=0;
				System.out.println(flag);
			}
			else
			{
				for(j=5;j<0;j--)
				{
					b[i][j]=c[j];
					value=value+1;
					a[i][j]=value;
					System.out.println(i);
					System.out.println(+j +" " +a[i][j]+ " " +b[i][j]);
				}
				flag=1;
				System.out.println(flag);
			}
		}
		/*for (i=0; i<18; i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.println(i+ " " +j +" " +a[i][j]+ " " +b[i][j]);
			}
		}*/
		/*for (int k=0; k<t; k++)
		{
			for (i=val1; i<18; i++)
			{
				for(j=val2;j<6;j++)
				{
					if(n[k]==a[i][j])
					{
						if(i%2==0)
						{
							System.out.println(a[i-1][j]+ " " +b[i-1][j]);
						}
						else
						{
		
							System.out.println(a[i+1][j]+ " " +b[i+1][j]);	
						}
					}
				}
			}
		}*/
	}
}
import java.util.*;

class Seating
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int testcase= s.nextInt();
		String[] a=new String[108];
		int number,i,j,value=0;
		for(i=0;i<testcase;i++)
		{
			number= s.nextInt();
			for(j=0;j<108;j=j+6)
			{
				a[j]="WS";
				a[j+1]="MS";
				a[j+2]="AS";
				a[j+3]="AS";
				a[j+4]="MS";
				a[j+5]="WS";
			}
			if(number>=1 && number<=12)
			{
				value=13-number;
			}
			else
			{
				if(number>=13 && number<=24)
				{
				value=37-number;
				}
				else
				{
					if(number>=25 && number<=36)
					{
						value=61-number;
					}
					else
					{
						if(number>=37 && number<=48)
						{
							value=85-number;
						}
						else
						{
							if(number>=49 && number<=60)
							{
								value=109-number;
							}
							else
							{
								if(number>=61 && number<=72)
								{
									value=133-number;
								}
								else
								{
									if(number>=73 && number<=84)
									{
										value=157-number;
									}
									else
									{
										if(number>=85 && number<=96)
										{
											value=181-number;
										}
										else
										{
											if(number>=97 && number<=108)
											{
												value=205-number;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(value +" " +a[value-1]);
		}
	}
}
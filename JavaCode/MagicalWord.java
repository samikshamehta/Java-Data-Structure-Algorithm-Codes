import java.util.*;

class MagicalWord 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int i,j,k,l,number, lower, upper,digit,flag;
		String stringvalue, Final;
		char character;
		int testcase=s.nextInt();
		for(l=0;l<testcase;l++)
		{
			number=s.nextInt();
			s.nextLine();
			stringvalue=s.nextLine();
			String[] stringfinal= new String[number];
			Final="";
			for(i=0; i<number; i++)
			{
			lower=67;
			upper=67;
			character= stringvalue.charAt(i);
			digit= (int)character;
			if(digit<65)
			{
				character=(char)67;
				stringfinal[i]=String.valueOf(character);
			}
			else							
			{
				if(digit>122)
				{
					character=(char)113;
					stringfinal[i]=String.valueOf(character);
				}
				else
				{
					for(j=65; j<122; j++)
					{
						flag=1;
						for( k=2; k<j; k++)
						{
							if(j%k==0)
							{
								flag=0;
								break;
							}
						}	
						if(flag==1)
						{
							if(lower<digit && upper<digit)
							{
								lower=upper;
								upper=j;
							}
							else
							{
								break;
							}
						}
					}
					if(digit-lower<=upper-digit)
					{
						character=(char)lower;	
						stringfinal[i]=String.valueOf(character);
					}
					else
					{
						character=(char)upper;
						stringfinal[i]=String.valueOf(character);
					}
				}
			}	
			Final=Final+stringfinal[i];	
			}
		System.out.println(Final);	
		}
	}
}
				
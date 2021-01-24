import java.util.*;

class ProfilePicture 
{
    
	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int length= s.nextInt();
		int number= s.nextInt();
		int width[]=new int[number];
		int height[]=new int[number];
		int i;
		for(i=0; i<number; i++)
		{
			width[i]= s.nextInt();
			height[i]=s.nextInt();
		}
		for(i=0; i<number; i++)
		{
			if(width[i]<length || height[i]<length)
			{
				System.out.println("UPLOAD ANOTHER");
			}
			else
			{
				if(width[i]>=length && height[i]>=length)
				{
					if(width[i]==height[i])
					{
						System.out.println("ACCEPTED");
					}
					else
					{
						System.out.println("CROP IT");

					}
				}
			}
		}
	}
}
		
		




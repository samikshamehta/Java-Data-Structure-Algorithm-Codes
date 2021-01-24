import java.util.*;
import java.io.*;
class MinMaxvalue
{
  	public static void main(String args[] ) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int i, exp = 1;
        int[] b = new int[number];
		int[] a = new int[number];
		int n=a.length;
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int m = a[0];
		for (i = 1; i < n; i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
			while (m / exp > 0)
			{

				int[] bucket = new int[number];
				for (i = 0; i < n; i++)
				{
					bucket[(a[i] / exp) % 10]++;
				}
				for (i = 1; i < 10; i++)
				{ 
					bucket[i] += bucket[i - 1];
				}
				for (i = n - 1; i >= 0; i--)
				{
					b[--bucket[(a[i] / exp) % 10]] = a[i];
				}
				for (i = 0; i < n; i++)
				{
					a[i] = b[i];
				}
				exp *= 10;        
			}
		}
		int flag=1;
		for (i = 0; i < n; i++)
		{
			if(i!=(n-1))
			{
				if(a[i+1]==a[i]+1 || a[i+1]==a[i])
				{
					flag++;
				}
			}
		}
		if(flag==n)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		} 
	}
}
import java.util.ArrayList;
import java.util.Scanner;


public class FibonacciWithGCD {
	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int q=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int j=1;j<=q;j++)
		{
			int l=s.nextInt();
			int r=s.nextInt();
			ArrayList<Integer>list=new ArrayList<>();
			ArrayList<Integer> array=fibonacci(arr,l-1,r-1,list);
			int gcd=findGCD(array,array.size());
			System.out.println(gcd%1000000007);
		}
	}
	public static ArrayList<Integer> fibonacci(int[]arr,int l,int r,ArrayList<Integer>list)
	{
		int n1=1,n2=1,n3=0;
		if(l<=r)
		{
			if(arr[l]==1 || arr[l]==2)
			{
				list.add(1);
			}
			else
			{
				int count=arr[l];
				while(count!=2)
				{
					n3=(n1+n2);
					n1=n2;
					n2=n3%1000000007;
					count--;
				}
				list.add(n3);
			}
			fibonacci(arr,l+1,r,list);
		}
		return list;
	}
	public static int findGCD(ArrayList<Integer>array,int n)
	{
		int result=array.get(0);
		for(int i=1;i<n;i++)
		{
			result=GCD(array.get(i),result);
		}
		
		return result; 
	}
	public static int GCD(int first,int second)
	{
		if(first==0)
		{
			return second;
		}return GCD(second%first,first);
	}
}

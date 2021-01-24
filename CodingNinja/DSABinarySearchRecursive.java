import java.util.Scanner;


public class DSABinarySearchRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int num=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		int ans=bsearch(arr,start,end,num);
		System.out.println(ans);
	}
	public static int bsearch(int[]arr,int start,int end,int num)
	{
		int mid=(start+end)/2;
		if(start>end)
		{
			return -1;
		}
		if(arr[mid]==num)
		{
			return mid;
		}
		else if(arr[mid]<num)
		{
			return bsearch(arr,mid+1,end,num);
		}
		else
			return bsearch(arr,start,mid-1,num);
	}
}

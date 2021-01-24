/*6. ZigZag Conversion 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
 */

import java.util.Scanner;


public class ZigZagConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		String output=convert(str,n);
		System.out.print(output);
	}
	public static String convert(String s, int numRows)
	 {
		String output="";
		int gap,count;
		gap=numRows+(numRows-3);
		count=gap;
		if(numRows==1)
		{
			return s;
		}
		if(numRows==2)
		{
			for(int i=0;i<numRows;i++)
			{
				for(int j=i;j<s.length();j=j+2)
				{
					output=output+s.charAt(j);
				}
			}
		}
		else
		{
			if(numRows>2)
			{
				for(int i=0;i<numRows;i++)
				{
					if(count!=0)			
					{
						if(i>=1 && count>1)
						{
							count=count-2;
						}
						else
						{
							if(count==1 && numRows>2)
							{
								count=0;
							}
						}
						for(int j=i;j<s.length();j=j+gap+1)
						{
							if(i==0 || count==0)
							{
								output=output+s.charAt(j);
							}
							else
							{
								if(i>=1)
								{
									output=output+s.charAt(j);
								}
								if(s.length()>count+j+1)
								{
									output=output+s.charAt(count+j+1);
								}
							}
						}
					}
					if(count==0)
					{
						break;
					}
				}
			}
		}
		return output;
	 }
}

import java.util.Scanner;


public class RecursionReturnPermutation {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String n=s.nextLine();
		String res[]=permutationOfString(n);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public static String[] permutationOfString(String input){
		
		if (input.length() == 1)
		{
			String[] returnL= {input};
			return returnL;
        }
        char initial = input.charAt(0); // first character
        String rem = input.substring(1); // Full string without first character
        String words[] = permutationOfString(rem);
        int permLen=words.length*(words[0].length()+1);
		String[] perm=new String[permLen];
        int j=0;
        for (String word : words)
        {
            for (int i = 0;i<=word.length();i++)
            {
            	perm[j++]=(charInsert(word, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char firstChar, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + firstChar + end;
    }
}

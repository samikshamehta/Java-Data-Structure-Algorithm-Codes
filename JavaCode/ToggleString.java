import java.util.*;
class ToggleString 
{
    
	public static void main(String args[] ) throws Exception 
	{
		/*
		scanner which can parse primitive types and strings using regular expressions
		Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
		A scanning operation may block waiting for input.
		Scanner is not safe for multithreaded use without external synchronization.
		*/

		Scanner s = new Scanner(System.in);

		//This method advances this scanner past the current line and returns the input that was skipped.

		String line = s.nextLine();
		String Sentence="";
		
		//System.out.println(line.length());
		
		for (int i = 0; i < line.length(); i++)
		{
			char c = line.charAt(i);
   
			if (Character.isLowerCase(c))

			{
 
				char ch=Character.toUpperCase(c);

				Sentence=Sentence+ch;
			}
     
			else
			{
				char ch=Character.toLowerCase(c);
				Sentence=Sentence+ch;
			}

		 }
		System.out.println(Sentence);
	}
        

        
   
}
	
import java.util.Scanner;

public class Assignment1
{
		public static void main(String[] args)
		{
			//allows for you to not have to use try and catch everytime you want to read something in 
			//from the user
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("This program checks for vowels in a word.\nPlease enter word.");
			String s = input.nextLine();
			
			//could use index of
			//String vowels = "aeiouAEIOU";
			//for(int i = 0; i < s.length(); i++):
				
			//{ if(vowels.indexOf(s.charAt(i)) != -1)
			//{ count++}}
			int count = 0;
			for(int i = 0; i < s.length(); i++)
			{
				String letter = "" + s.charAt(i);
				
				if(letter.equalsIgnoreCase("a"))
				{
					count++;
				}
				else if(letter.equalsIgnoreCase("e"))
				{
					count++;
				}
				else if(letter.equalsIgnoreCase("i"))
				{
					count++;
				}
				else if(letter.equalsIgnoreCase("o"))
				{
					count++;
				}
				else if(letter.equalsIgnoreCase("u"))
				{
					count++;
				}
			}
			System.out.println("There is " + count + " vowels in the word, " + s);
			input.close();
			
		}


}

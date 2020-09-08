import java.util.Scanner;

public class Assignment1
{
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("This program checks for vowels in a word.\nPlease enter word.");
			String s = scanner.nextLine();
			
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
			
		}


}

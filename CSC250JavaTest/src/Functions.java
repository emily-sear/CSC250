public class Functions
{
	public static void main(String[] args)
	{
		String s = "elephant";
		System.out.println(Functions.lastIndexOfVowel(s));
		
	}
	//returns the position of the last vowel in the string or -1 if none were found
	static int lastIndexOfVowel(String s)
	{
		int lastVowel = -1;
		
		String vowels = "aeiou";
		s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(vowels.indexOf(s.charAt(i)) != -1)
			{
				lastVowel = i;
			}
		}
		return lastVowel;
	}
	
	//The same function as before but with walking backwards
	static int lastIndexOfVowel2(String s)
	{
		String vowels = "aeiou";
		s.toLowerCase();
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			if(vowels.indexOf(s.charAt(i)) != -1)
			{
				return i;
			}
		}
		return -1;
	}
}

public class StringTests
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		
		// returns a char at a specific spot
		System.out.println(s.charAt(1));
		
		// returns the length of the calling string
		System.out.println(s2.length());
		
		// returns the index of the first index, otherwise it will give you a -1 if the thing is not there
		System.out.println(s2.indexOf("p"));
		
		System.out.println(s == "hello");
		System.out.println(s == s2); // Don't use this, use .equals() comparing the value of s and s2... the value is a pointer to a place in memory
		
		
		
		
		
		
	}
}

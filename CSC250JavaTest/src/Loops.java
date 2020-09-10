public class Loops
{
	public static void main(String[] args)
	{
		//for each loops
		String s = "elephant";
		char[] ar = s.toCharArray();
		
		for(char c: ar)
		{
			System.out.println(c);
		}
		
		int[] ar2 = {1,2,3,4,5};
		for(int lol: ar2)
		{
			System.out.println(lol);
		}		
		
		//while loops
		//byte b = 0;
		//while(true)
		//{
			//System.out.println(b);
			//prints out numbers 0 -127 and then -128 - 127
			//b++;
		//}
		
		//do while loops
		int i = 0;
		do
		{
			System.out.println(++i);
		}
		while(i < 10);
	
		}
	}


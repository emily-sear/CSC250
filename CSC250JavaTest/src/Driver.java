
public class Driver
{
	//every program begins and ends with main
	public static void main(String[] args)
	{
		//how variables look in java
		int a = 5;
		System.out.println(a);
		a += 6;
		System.out.println(a);
		
		//if statements
		//the curly braces are technically not required if you have one line of code (don't do this dummy)
		if(a < 10)
		{
			System.out.println("Woot");
		}
		else if (a < 13)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("lol");
		}
		
		//while loops
		while(a < 10)
		{
			System.out.println(a);
			a++;
		}
		
		int addedNums = addNums(3, 5);
		
		System.out.println(addedNums);
	} //ends the main method


/*
 * type method_name(comma_delima_params)
 * {
 * 	logic
 * }
 */

	static int addNums(int a, int b)
	{
		return a + b;
	}
} //ends the class

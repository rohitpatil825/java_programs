import java.util.*;
class InvalidAgeException extends Exception
{}

class Vote
{
	private byte age;
	Scanner sc=new Scanner(System.in);
	void input() throws InvalidAgeException
	{

		System.out.println("Enter Your age : ");
		age=sc.nextByte();
		if(age<=18)
		{
			throw new InvalidAgeException();
		}
		System.out.println("Your Are Eligible For Voting");
		
	}
	void show()
	{
		System.out.println("Your Age is : "+age);
	}
}
public class VoteDemo
{
	public static void main(String[] args)
	{
		Vote ob=new Vote();
		try
		{
			ob.input();
			ob.show();
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(" Your age is less than 18");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Enter a valid no ");
		}
	}
}
		
				
		
	
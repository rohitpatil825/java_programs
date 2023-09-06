import java.util.Scanner;
class NegativeNoException extends Throwable
{}
class OddNoException extends Exception
{}

public class SumDemo
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter a First no : ");
			a=sc.nextInt();
			System.out.println("Enter a Second No : ");
			b=sc.nextInt();
			if(a<0 || b<0)
			{
				throw new NegativeNoException();
			}
			if(a%2!=0 ||b%2!=0)
			{
				throw new OddNoException();
			}
			System.out.println("Sum of " + a + " And " + b + " is " + (a + b));

		}
		catch(NegativeNoException ex)
		{
			System.out.println("Enter a positive no ");
		}
		catch(OddNoException ex)
		{
			System.out.println("Enter a even no ");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

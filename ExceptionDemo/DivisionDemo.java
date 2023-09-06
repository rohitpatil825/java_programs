//prog: Division of two no without exception handling
import java.util.*;
public class DivisionDemo
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first no : ");
		a=sc.nextInt();
		System.out.println("Enter a second no :  ");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division of "+a+" And "+b+" is "+c);
	}
}
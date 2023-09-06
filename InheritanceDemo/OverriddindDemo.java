//Multiple overridding Demo
import java.util.Scanner;
class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void input()
	{
	
		System.out.println("Enter a First no : ");
		a=sc.nextInt();
	}
	void show()
	{
		System.out.println("First no = "+a);
	}
}
class B extends A
{
	int b;
	void input()
	{
		super.input();
		System.out.println("Enter a Second no : ");
		b=sc.nextInt();
	}
	void show()
	{
		super.show();
		System.out.println("Second  no = "+b);
	} 
}
class C extends B
{
	private int c;
	void sum()
	{
		c=a+b;
		System.out.println("Sum ="+c);
	}
}
public class OverriddingDemo
{
	public static void main(String[] args)
	{
		C ob=new C();
		ob.input();
		ob.show();
		ob.sum();
	}
}
	
//Hierarchichal overridding Demo
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
	private int b,c;
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
	void sum()
	{
		c=a+b;
		System.out.println("Sum ="+c);
	}
}
class C extends A
{
	private int d,e;
	void input()
	{
		super.input();
		System.out.println("Enter a Second no : ");
		d=sc.nextInt();
	}
	void show()
	{	
		super.show();
		System.out.println("Second  no = "+d);
	} 
	void sum()
	{
		e=a+d;
		System.out.println("Sum ="+e);
	}
}
public class OverriddingDemo1
{
	public static void main(String[] args)
	{
		B ob=new B();
		C ob1=new C();
		System.out.println("using class A and B");
		ob.input();
		ob.show();
		ob.sum();
		System.out.println("Using class A and C");
		ob1.input();
		ob1.show();
		ob1.sum();
	}
}
	
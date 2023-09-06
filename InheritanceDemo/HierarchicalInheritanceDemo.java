import java.util.Scanner;
class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void inputA()
	{
	
		System.out.println("Enter a First no : ");
		a=sc.nextInt();
	}
	void showA()
	{
		System.out.println("First no = "+a);
	}
}
class B extends A
{
	private int b,c;
	void inputB()
	{
		System.out.println("Enter a Second no : ");
		b=sc.nextInt();
	}
	void showB()
	{
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
	void inputC()
	{
		System.out.println("Enter a Second no : ");
		d=sc.nextInt();
	}
	void showC()
	{
		System.out.println("Second  no = "+d);
	} 
	void sum()
	{
		e=a+d;
		System.out.println("Sum ="+e);
	}
}
public class HierarchicalInheritanceDemo
{
	public static void main(String[] args)
	{
		B ob=new B();
		C ob1=new C();
		System.out.println("using class A and B");
		ob.inputA();
		ob.inputB();
		ob.showA();
		ob.showB();
		ob.sum();
		System.out.println("Using class A and C");
		ob1.inputA();
		ob1.inputC();
		ob1.showA();
		ob1.showC();
		ob1.sum();
	}
}
	
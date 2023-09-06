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
	int b;
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
		int c;
		c=a+b;
		System.out.println("Sum ="+c);
	}
}
public class SingleInheritanceDemo
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.inputA();
		ob.inputB();
		ob.showA();
		ob.showB();
		ob.sum();
	}
}
	
//prog: CircleDemo 1
import java.util.Scanner;
class Circle
{
	float r;
	static float PI=3.14f;
	Circle()
	{
		r=9.2f;
	}
	Circle(Circle ob)
	{
		r=ob.r;
	}
	Circle(float r)
	{
		this.r=r;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a redius : ");
		r=sc.nextFloat();
	}
	void show()
	{
		System.out.println("Redius = "+r);
	}
	void area()
	{
		System.out.println("Area of Circle is : "+PI*r*r);
	}
	void circum()
	{
		System.out.println("Circumference of circle is : "+2*PI*r);
	}
}
public class CircleDemo1
{
	public static void main(String[] args)
	{
		Circle ob1,ob2,ob3,ob4;
		System.out.println("Using ob1 ");
		ob1=new Circle();
		ob1.show();
		ob1.area();
		ob1.circum();
		System.out.println("Using ob2 ");
		ob2=new Circle(18.3f);
		ob2.show();
		ob2.area();
		ob2.circum();
		System.out.println("Using ob3 ");
		ob3=new Circle(ob1);
		ob3.show();
		ob3.area();
		ob3.circum();
		System.out.println("Using ob4 ");
		ob4=new Circle();
		ob4.input();
		ob4.show();
		ob4.area();
		ob4.circum();
	}
}
		
		
		
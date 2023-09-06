import java.util.Scanner;
public class Circle
{
	public static void main(String[] args)
	{
		float r,area,circum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Redius : ");
		r=sc.nextFloat();
		area=(float)(3.14*r*r);
		circum=(float)(2*3.14*r);
		System.out.println("Area = "+area);
		System.out.println("Circumference = "+circum);
	}
}
		
		
			
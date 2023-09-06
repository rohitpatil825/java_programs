//prog: to check Given email is valid or not 
import java.util.Scanner;
public class Email
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Enter a Email : ");
		email=sc.nextLine();
		int spo=email.indexOf('@');
		int lpo=email.lastIndexOf('@');
		System.out.println(spo);
		System.out.println(lpo);
		if(spo!=lpo ||spo==-1)
		{
			System.out.println("Invalid Email ");
			return;
		}
		spo=email.indexOf('.');
		lpo=email.lastIndexOf('.');
		System.out.println(spo);
		System.out.println(lpo);
		if(spo==-1)
		{
			System.out.println("Invalid email");
		}
		System.out.println("Email is Valid ");
		
	}
}
		
		
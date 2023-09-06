//prog : read two String and search second string within first String

import java.util.Scanner;
public class StrSearch
{
	public static void main(String[] args)
	{
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first String : ");
		str1=sc.nextLine();
		System.out.println("Enter a second String : ");	
		str2=sc.nextLine();
		System.out.println("First string is : "+str1);
		System.out.println("second string is : "+str2);
		if(str1.indexOf(str2)==-1)
		{
			System.out.println(str2+" is not found in "+str1);
			return;
		}
		System.out.println(str2+" is found in "+str1);
	}
}

		 
		
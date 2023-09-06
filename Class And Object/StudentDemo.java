import java.util.*;
class InvalidRnoException extends Exception
{}
class InvalidMarkException extends Exception
{}

class Student
{
	byte rollno,std,s1,s2,s3;
	short total;
	String name,div,rem;
	float avg;
	int getTotal()
	{
		return (s1+s2+s3);
	}
	float getAvg()
	{
		return (float) getTotal()/3.0f;
	}
	String getRemark()
	{
		float av=getAvg();
		if(av>75)
			return(" first class with Distiction");
		else if(av>65)
			return(" first class");
		else if(av>55)
			return("Second class");
		else if(av>35)
			return("Pass");
		else
			return("Fail ");
	}
		
	
	public Student()
	{
		rollno=1;
		std=13;
		s1=80;
		s2=75;
		s3=89;
		total=(short)getTotal();
		name="Aniket Dada";
		div="A";
		rem=getRemark();
		avg=getAvg();
	}
	public Student(int Rollno,int Std,int S1,int S2,int S3,String Name,String Div)
	{
		rollno=(byte)Rollno;
		std=(byte)std;
		s1=(byte)S1;
		s2=(byte)S2;
		s3=(byte)S3;
		total=(short)getTotal();
		name=Name;
		div=Div;
		rem=getRemark();
		avg=getAvg();
	}
	public Student(Student s)
	{
		rollno=s.rollno;
		std=s.std;
		s1=s.s1;
		s2=s.s2;
		s3=s.s3;
		total=s.total;
		name=s.name;
		div=s.div;
		rem=s.rem;
		avg=s.avg;
	}
	void input() throws InvalidRnoException,InvalidMarkException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Roll no : ");
		rollno=sc.nextByte();
		if(rollno<0 || rollno>100)
		{
			throw new InvalidRnoException();
		}
		System.out.println("Enter a sub1 marks : ");
		s1=sc.nextByte();
		if(s1<0 || s1>100)
		{
			throw new InvalidMarkException();
		}
		System.out.println("Enter a sub2 marks : ");
		s2=sc.nextByte();
		if(s2<0 || s2>100)
		{
			throw new InvalidMarkException();
		}
		System.out.println("Enter a sub3 marks : ");
		s3=sc.nextByte();
		if(s3<0 || s3>100)
		{
			throw new InvalidMarkException();
		}
		System.out.println("Enter a Name : ");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter a Division : ");
		div=sc.nextLine();
		total=(short)getTotal();
		avg=getAvg();
		rem=getRemark();
	}
	void show()
	{
		System.out.println(" Name = "+name);
		System.out.println(" Roll no ="+rollno);
		System.out.println(" Division = "+div);
		System.out.println(" Sub 1 marks = "+s1);
		System.out.println(" Sub 2 marks = "+s2);
		System.out.println(" Sub 3 marks = "+s3);
		System.out.println(" Total = "+total);
		System.out.println(" Average = "+avg);
		System.out.println(" Remark = "+rem);
	}
}
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student ob1=new Student();
		Student ob2=new Student(5,13,67,87,89,"Swarup","B");
		Student ob3=new Student(ob2);
		Student ob4=new Student();
		try
		{		
		System.out.println("***************************************** ob1 Data ***********************************************");
		ob1.show();
                System.out.println("***************************************** ob2 Data ***********************************************");
		ob2.show();
                System.out.println("***************************************** ob3 Data ***********************************************");
		ob3.show();
		System.out.println("***************************************** ob4 Data ***********************************************");
		ob4.input();
		ob4.show();
		}
		catch(InvalidRnoException ex)
		{
			System.out.println("Enter a Valid Roll no");
		}
		catch(InvalidMarkException ex)
		{
			System.out.println("Enter a Valid Marks");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Enter a Valid Information");
		}

		
	}
}



	
	
		
		
		
import java.util.*;
class InvalidSpeedException extends Exception
{}
class InvalidWarException extends Exception
{}
class InvalidPriceException extends Exception
{}
class InvalidBladeException extends Exception
{}

class Fan4
{
	private String fcomp,ftype,fcolor;
	private byte speed,war,nob;
	private short price;
	private boolean stat;
	void show()
	{
		System.out.println("Company = "+fcomp);
		System.out.println("Type = "+ftype);
		System.out.println("Color = "+fcolor);
		System.out.println("Speed = "+speed);
		System.out.println("Warranty ="+war);
		System.out.println("No. of Blades = "+nob);
		System.out.println("Price = "+price);
		System.out.println("Stst = "+stat);
	}
	void on()
	{
		stat=true;
		if(speed!=0)
		{
			System.out.println("Fan moving at speed : "+speed);
		}
		else
		{
			System.out.println("Fan is not moving Speed is 0");
		}
	}
	void off()
	{
		stat=false;
		System.out.println("Fan is off");
	}
	void setSpeed(int sp) 
	{
		if(sp<0)
		{
			sp=0;
		}
		if(sp>=5)
		{
			sp=5;
		}
			
		speed=(byte)sp;
		if(stat)
		{
			System.out.println("Fan moving,speed is : "+speed);
		}
		else
		{
			System.out.println("Fan is not Moving,speed is "+speed);
		}
	}
	void input() throws InputMismatchException,InvalidWarException,InvalidPriceException,InvalidBladeException,InvalidSpeedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Company : ");
		fcomp=sc.nextLine();
		System.out.println("Enter a Type : ");
		ftype=sc.nextLine();
		System.out.println("Enter a Color : ");
		fcolor=sc.nextLine();
		System.out.println("Enter a Speed : ");
		speed=sc.nextByte();
		if(speed<0 || speed>5)
		{
			throw new InvalidSpeedException();
		}
		System.out.println("Enter a Warranty : ");
		war=sc.nextByte();
		if(war<0 || war>3)
		{
			throw new InvalidWarException();
		}
		System.out.println("Enetr a No. of Blades ");
		nob=sc.nextByte();
		if(nob<3 || nob>4)
		{
			throw new InvalidBladeException();
		}
		System.out.println("Enter a price : ");
		price=sc.nextShort();
		if(price<1000 || price>5000)
		{
			throw new InvalidPriceException();
		}
	}
	public Fan4()
	{
		fcomp="Bajaj";
		ftype="Table";
		fcolor="Blue";
		speed=3;
		war=2;
		nob=3;
		price=3000;
		stat=false;
	}
	Fan4(String Fcomp,String Ftype,String Fcolor,int Speed,int War,int Nob,int Price,boolean Stat)
	{
		fcomp=Fcomp;
		ftype=Ftype;
		fcolor=Fcolor;
		speed=(byte)Speed;
		war=(byte)War;
		nob=(byte)Nob;
		price=(short)Price;
		stat=Stat;
	}
	Fan4(Fan4 ob)
	{
		fcomp=ob.fcomp;
		ftype=ob.ftype;
		fcolor=ob.fcolor;
		speed=ob.speed;
		war=ob.war;
		nob=ob.nob;
		price=ob.price;
		stat=ob.stat;
	}
}
public class FanDemo4
{
	public static void main(String[] args)
	{
		try
		{
			Fan4 ob1=new Fan4();
			Fan4 ob2=new Fan4("Mi","Ceiling","Brown",2,1,3,4200,true);
			Fan4 ob3=new Fan4(ob2);
			Fan4 ob4=new Fan4();
			System.out.println("Using ob1 data");
			ob1.show();
			ob1.on();
			ob1.off();
			ob1.setSpeed(5);
			System.out.println("Using ob2 data");
			ob2.show();
			ob2.on();
			ob2.off();
			ob2.setSpeed(2);
			System.out.println("Using ob3 data");
			ob3.show();
			ob3.on();
			ob3.off();
			ob3.setSpeed(4);
			System.out.println("Using ob4 data");
			ob4.input();
			ob4.show();
			ob4.on();
			ob4.off();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Enter a inte only");
		}
		catch(InvalidSpeedException ex)
		{
			System.out.println("Enter speed btween 0 to 5");
		}
		catch(InvalidWarException ex)
		{
			System.out.println("Enetr a Warranty between 1 to 3");
		}
		catch(InvalidPriceException ex)
		{
			System.out.println("Enter a Price between 1000 to 5000");
		}
		catch(InvalidBladeException ex)
		{
			System.out.println("Enter a no of blade is 3 or 4 only");
		}
	}
}
		
		
		
		

					
	
		
		

		
	
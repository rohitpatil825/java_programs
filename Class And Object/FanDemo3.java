
//prog: Constructor Demo
class Fan3
{
	private String fcomp,ftype,fcolor;
	private byte war,nob,speed;
	private short price;
	private boolean state;
	void show()
	{
		System.out.println("company ="+fcomp);
		System.out.println("Type ="+ftype);
		System.out.println("Color ="+fcolor);
		System.out.println("Warranty ="+war);
		System.out.println("No of blades ="+nob);
		System.out.println("Speed ="+speed);
		System.out.println("Price = "+price);
		System.out.println("State = "+state);
	}
	Fan3(String Fcomp,String Ftype,String Fcolor,int War,int Speed,int Nob,int Price,boolean State)	
	{
		fcomp=Fcomp;
		ftype=Ftype;
		fcolor=Fcolor;
		war=(byte)War;
		speed=(byte)Speed;
		nob=(byte)Nob;
		price=(short)Price;
		state=State;
	}
	Fan3()
	{
		fcomp="Bajaj";
		ftype="Ceiling";
		fcolor="Black";
		war=1;
		speed=2;
		nob=3;
		price=1500;
		state=false;
	}
	Fan3(Fan3 ob)
	{		
		fcomp=ob.fcomp;
		ftype=ob.ftype;
		fcolor=ob.fcolor;
		war=ob.war;
		speed=ob.speed;
		nob=ob.nob;
		price=ob.price;
		state=ob.state;
	}
		
}
public class FanDemo3
{
	public static void main(String[] args)
	{
		Fan3 f1=new Fan3("Usha","Ceiling","Brown",1,3,4,2000,false);
		Fan3 f2=new Fan3();
		Fan3 f3=new Fan3(f1);
		f1.show();
		f2.show();
		f3.show();
	}
}

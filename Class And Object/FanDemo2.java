

//prog: Assining the Specified value of data mamber 
class Fan2
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
	void setValues(String Fcomp,String Ftype,String Fcolor,int War,int Speed,int Nob,int Price,boolean State)	
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
	void setValues()
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
	void setValues(Fan2 ob)
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
public class FanDemo2
{
	public static void main(String[] args)
	{
		Fan2 f1=new Fan2();
		Fan2 f2=new Fan2();
		Fan2 f3=new Fan2();
		f1.setValues("Usha","Ceiling","Brown",1,3,4,2000,false);
		f1.show();
		f2.setValues();
		f2.show();
		f3.setValues(f1);
		f3.show();
	}
}

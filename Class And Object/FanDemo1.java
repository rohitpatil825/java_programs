//prog: Assining the Specified value of data mamber 
class Fan1
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
}
public class FanDemo1
{
	public static void main(String[] args)
	{
		Fan1 f1=new Fan1();
		f1.setValues("Usha","Ceiling","Brown",1,3,4,2000,false);
		f1.show();
	}
}

// program to Assign fix value
class Fan
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
	void setValues()	
	{
		fcomp="Bajaj";
		ftype="Table";
		fcolor="Black";
		war=1;
		speed=3;
		nob=4;
		price=2300;
		state=true;
	}
}
public class FanDemo
{
	public static void main(String[] args)
	{
		Fan f1=new Fan();
		f1.setValues();
		f1.show();
	}
}

	
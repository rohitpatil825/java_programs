//prog: Casting Demo
public class CastDemo
{
	public static void main(String[] args)
	{
		byte b=50;
		float f=2.91f;
		int i=1240999;
		long l=154596916;
		System.out.println("b= "+b);
		System.out.println("f= "+f);
		System.out.println("i= "+i);
		System.out.println("l= "+l);
		double d=f*2;
		l=i;
		i=b;
		System.out.println("d= "+d);
		System.out.println("i= "+i);
		System.out.println("l= "+l);
		b=(byte)i;
		i=(int)l;
		l=(long)d;
		System.out.println("b= "+b);
		System.out.println("i= "+i);
		System.out.println("l= "+l);
	}
}
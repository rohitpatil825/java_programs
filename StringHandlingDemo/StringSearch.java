//prog: String demo character Searching
public class StringSearch
{
	public static void main(String[] args)
	{
		String msg=" I like Ice,i Like Icecreeme too";
		System.out.println(msg);
		System.out.println("index of i in"+msg+" is "+msg.indexOf('i'));
		System.out.println("index of i in"+msg+" is "+" from 10th location is "+msg.indexOf('i',10));
		System.out.println("index of Ice in"+msg+" is "+msg.indexOf("Ice"));
		System.out.println("index of Ice in"+msg+" is "+" from 15th location is "+msg.indexOf("Ice",15));
		System.out.println("index of i from end in"+msg+" is "+msg.lastIndexOf('i'));
		System.out.println("index of i from end in"+msg+" is "+" from 10th location is "+msg.lastIndexOf('i',10));
		System.out.println("index of Ice from end in"+msg+" is "+msg.lastIndexOf("Ice"));
		System.out.println("index of Ice from end in"+msg+" is "+" from 15th location is "+msg.lastIndexOf("Ice",15));
	}
}

		

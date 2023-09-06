//prog : to print name in Accending order

public class StringDemo2
{
	public static void main(String[] args)
	{
		String[] nm={"Tushar","Sahil","Harsh","Rohit","Yash"};
		byte i,j;
		String temp;
		System.out.println("Before Swaping");
		for(i=0;i<nm.length;i++)
		{
			System.out.println(nm[i]);
		}
		for(i=0;i<nm.length;i++)
		{
			for(j=(byte)(i+1);j<nm.length;j++)
			{
				if(nm[j].compareTo(nm[i])<0)
				{
					temp=nm[i];
					nm[i]=nm[j];
					nm[j]=temp;
				}
			}
		}
		System.out.println("After Swapping ");
		for(i=0;i<nm.length;i++)
		{
			System.out.println(nm[i]);
		}
	}
}
		
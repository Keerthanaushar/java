import java.io.*;
import java.lang.*;

class Distance implements Cloneable
{
	int inch,feet;
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone Error");
			return this;
		}
	}	
}


class CloneDistance
{
	public static void main(String args[])
	{
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			Distance d1=new Distance();
			System.out.println("Enter inch: ");
			d1.inch=Integer.parseInt(dis.readLine());;
			d1.feet=Integer.parseInt(dis.readLine());;
			System.out.println("Inch= "+d1.inch+" Feet= "+d1.feet);
			Distance d2=(Distance)d1.clone(); //creation of clone
			System.out.println("Inch= "+d2.inch+" Feet= "+d2.feet);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}

import java.io.*;
import java.lang.*;
class Gen<t1,t2>
{
	public void disp(t1 a,t2 b)
	{
		System.out.println("The datatype of "+a+" is : "+a.getClass());
		System.out.println("The datatype of "+b+" is : "+b.getClass());
		} 
	}
class gp
{
	public static void main(String args[])
	{
	Gen<Double,Integer> obj1=new Gen<Double,Integer>();
	obj1.disp(2.2,2);
	Gen<String,Integer> obj2=new Gen<String,Integer>();
	obj2.disp(new String("world"),1);
	}
}
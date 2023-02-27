//Write a program to calculate the prime factors of a given number, using packages.


import java.io.*;
import java.lang.*;
import primepackage.*;
 
class primefac1
{
	public static void main(String args[])
	{
		try
		{
			int m=1,d,temp;
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter the number:");
			int num=Integer.parseInt(dis.readLine());
			temp=num;
			primeFac obj=new primeFac();
			obj.disp(temp);
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	}
}
 

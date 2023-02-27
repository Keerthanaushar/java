import java.io.*;
import java.lang.*;

class CString
{
	String str1,str2;
	DataInputStream dis=new DataInputStream(System.in);
	public void read()
	{
		try
		{
			System.out.println("Enter String1: ");
			str1=dis.readLine();
			System.out.println("Enter String2: ");
			str2=dis.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	public void display()
	{
		System.out.println(str1);
		System.out.println(str2);
	}
	public void comp()
	{
		System.out.println(str1.compareTo(str2));
	}
	public void add()
	{
		System.out.println(str1+str2);
	}
	public void concat()
	{
		System.out.println(str1.concat(str2));
	}
}

class StringFunc
{
	public static void main(String args[])
	{
		CString s= new CString();
		s.read();
		s.display();
		s.comp();
		s.add();
		s.concat();
	}
}
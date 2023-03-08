import java.io.*;
import java.util.*;
class PalinException extends Exception
{
	PalinException(String msg)
	{
		super(msg);
	}
}
class ThrowFinal
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		StringBuffer rev=new StringBuffer(str);
		rev=rev.reverse();
		try
		{
			if(str.equals(rev.toString()))
			{
				System.out.println("The Entered string is a palindrome");
			}
			else
			{
				throw new PalinException("The Entered string is not a palindrome");
			}
		}
		catch(PalinException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(str);
		}
	}
}
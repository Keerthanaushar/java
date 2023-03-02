import java.util.*;
import java.lang.*;

class StringMenu
{
	public static void main(String args[])
	{
		int ch=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1=sc.nextLine();
		System.out.println("Enter String2: ");
		String s2=sc.nextLine();
		do
		{
		System.out.println("Enter Your Choice: ");
		System.out.println("1.Length of string");
		System.out.println("2.Compare two Strings");
		System.out.println("3.Substring");
		System.out.println("4.Convert to Uppercase");
		System.out.println("5.Convert to Lowercase");
		System.out.println("6.EXIT!");
		ch=Integer.parseInt(sc.nextLine());
		switch(ch)
		{
			case 1: int n=s1.length();
					System.out.println(n);
					break;
		
			case 2:System.out.println(s1.equals(s2));
					break;
			case 3:System.out.println(s1.substring(1,3));
					break;
			case 4:System.out.println(s1.toUpperCase());
					break;
			case 5:System.out.println(s2.toLowerCase());
					break;
			case 6: break;
		}
		}
		while(ch<6);
	}
}
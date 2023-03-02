import java.util.*;
import java.lang.*;

class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1);
		StringBuffer str=s1.reverse();
		System.out.println(str);
	}
}
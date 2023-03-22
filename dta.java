import java.lang.*;
class dta
{
	public static < E > void printArray(E[] array)
	{
		for(E element:array)
		{
		System.out.println(element);
		} 
	}
	public static void main(String args[])
	{
		Integer[] ia={1,2,3};
		Double[] da={1.1,1.2,1.3,1.4};
		Character[] ca={'h','e','l','l','o'};
		String[] sa={"a","b"};
		printArray(ia);
		printArray(da);
		printArray(ca);
		printArray(sa);
	} 
}
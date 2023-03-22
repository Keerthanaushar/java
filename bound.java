import java.io.*;
import java.lang.*;
class bound
{
	public static <E extends Number> double avgar(E[] ar)
	{
		double sum=0.0,a;
		int c=0;
		for(E element:ar)
		{
			sum=sum+element.doubleValue();
			c=c+1;
			}
		return (sum/c);
		}
	public static void main(String args[])
	{
		double r1,r2;
		Integer[] ia={2,4,6};
		Double[] da={4.0,8.2};
		r1=avgar(ia);
		r2=avgar(da);
		if(r1>r2)
		{
			System.out.println(r1+" is Larger than "+r2);
			}
		else if(r2>r1)
		{
			System.out.println(r2+" is Larger than "+r1);
			}
		else if(r1==r2)
		{
			System.out.println(r1+" and "+r2+" is equal");
			}
		else
		{
			System.out.println(r1+" and "+r2+" is not equal");
			} 
		}
	}
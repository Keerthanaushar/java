import java.util.*;
class PrimeNumberException extends Exception
{
    PrimeNumberException(String msg)
    {
        super(msg);
    }
}
class UserDefException
{
    public static void main(String args[])
    {
        try
        {
            int num,i,count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number:");
            num=sc.nextInt();
            if(num==2)
            {
                throw new PrimeNumberException(num+" is a prime number");
            }
            for(i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                throw new PrimeNumberException(num+" is a prime number");
            }
            else
            {
                System.out.println(num+" has "+count+" divisor(s)");
            }
        }
        catch(PrimeNumberException e)
        {
            System.out.println(e);
        }
    }
}
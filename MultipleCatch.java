import java.io.*;
import java.lang.*;
class MultipleCatch
{
    public static void main(String args[])
    {
        try
        {
            int i=0;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("enter the limit :");
            int n=Integer.parseInt(dis.readLine());
            int a[]=new int[3];
            while(i<n)
            {
                System.out.println("enter the element:");
                a[i]=Integer.parseInt(dis.readLine());
                i=i+1;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        catch(Exception e){System.out.println(e);}
    }
}
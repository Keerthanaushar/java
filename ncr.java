//Write a program to calculate the value of nCr for given value of n & r, using packages.

import java.io.*;
import ncrPac.*;
import java.lang.*;
class ncr
{
public static void main(String args[])
{
 try
 {
 int result2,i;
 DataInputStream dis=new DataInputStream(System.in);
 System.out.println("enter n:");
 int n=Integer.parseInt(dis.readLine());
 System.out.println("enter r:");
 int r=Integer.parseInt(dis.readLine());
 int d=n-r;
 ncrpack obj=new ncrpack();
 result2=obj.ncrmethod(n,d);
 System.out.println("result="+result2);
 }
 catch(Exception e)
 {
 System.out.println("error"+e);
 }
}
}



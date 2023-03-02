//Program to implement run time polymorphism in Java using interface, wrt calculating area of a triangle.

import java.io.*;
import java.lang.*;
interface triangle
{
public Double Area(Double b,Double h);
}
class Prgm implements triangle
{
public Double Area(Double b,Double h)
{
 return 0.5*b*h;}
}
class TriangleArea
{
public static void main(String args[])
{
try
{
Double b,h,r;
 DataInputStream dis=new DataInputStream(System.in);
 System.out.println("enter the b=");
 b=Double.parseDouble(dis.readLine());
 System.out.println("enter the h=");
 h=Double.parseDouble(dis.readLine());
 triangle obj=new Prgm();
 r=obj.Area(b,h);
 System.out.println("output="+r);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}

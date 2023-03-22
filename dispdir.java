import java.io.*;
import java.lang.*;
class dispdir
{
public static void main(String args[])
{
try
{
int i,j=0;
File subf=new File("D:\\");
String a[]=subf.list();
String b[]=subf.list();
for(i=0;i<a.length;i++)
{
subf=new File("D:\\"+a[i]);
if(subf.isDirectory())
{
System.out.println("Directory: "+a[i]);
}
else
{
b[j]=a[i];
j=j+1;
}
}
for(i=0;i<a.length;i++)
{
System.out.println("File: "+b[i]);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
import java.io.*;
import java.lang.*;
import java.util.*;
class raf
{
public static void main(String args[])
{
String fname,fcon,name;
int ch=1;
try
{
Scanner console=new Scanner(System.in);
DataInputStream br=new DataInputStream(System.in);
System.out.println("the file is creating");
System.out.println("enter the file name");
fname=console.nextLine();
RandomAccessFile f1=new RandomAccessFile("E:\\"+fname+".txt","rw");
do {
System.out.println("1.writing\n2.appending\n3.reading");
System.out.println("enter the choice:");
int c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("enter the elements into "+fname+" file");
fcon=console.nextLine();
f1.write(fcon.getBytes());
break;
case 2:f1.seek(f1.length());
System.out.println("enter the elements into "+fname+" file");
fcon=console.nextLine();
f1.write(fcon.getBytes());
break;
case 3:f1.seek(0);
byte[] bytes=new byte[20];
f1.read(bytes);
System.out.println(new String(bytes));
}
System.out.println("do you want to continue(1/0)");
ch=Integer.parseInt(br.readLine());
} while (ch==1);
f1.close();
}
catch(Exception e)
{
System.out.println("error"+e);
} }
}

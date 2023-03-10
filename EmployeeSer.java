
import java.io.*;
public class EmployeeSer
{
public static void main(String args[])
{
 Employee s=new Employee("ammu",20,100);
 try
 {
 FileOutputStream fout=new FileOutputStream("E:\\Employee.txt");
 ObjectOutputStream out=new ObjectOutputStream(fout);
 out.writeObject(s);
 out.close();
 fout.close();
 System.out.println("Serialization Happened");
 
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
}
}

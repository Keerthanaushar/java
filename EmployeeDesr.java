import java.io.*;
public class EmployeeDesr
{
public static void main(String args[])
{
 Employee s=null;
 try
 {
 FileInputStream fin=new FileInputStream("E:\\Employee.txt");
 ObjectInputStream in=new ObjectInputStream(fin);
 s=(Employee)in.readObject();
 System.out.println("name="+s.name);
 System.out.println("age="+s.age);
 System.out.println("id="+s.id);
 fin.close();
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
 catch(ClassNotFoundException e)
 {
 System.out.println(e);
 }
}
}

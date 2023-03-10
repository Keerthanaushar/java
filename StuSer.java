
import java.io.*;
public class StuSer
{
public static void main(String args[])
{
 Student s=new Student("kkk",21,"F");
 try
 {
 FileOutputStream fos=new FileOutputStream("E:\\Stu.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(s);
 fos.close();
 oos.close();
 System.out.println("Serialization happened");
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
}
}

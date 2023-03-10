import java.io.*;
class StuDeSer
{
public static void main(String args[])
{
Student st=null;
try{
	FileInputStream fis=new FileInputStream("E:\\stu.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	st=(Student)ois.readObject();
	System.out.println("Name is" +st.name);
	System.out.println("Age is" +st.age);
	System.out.println("Gender is" +st.gender);
	fis.close();
	ois.close();
	System.out.println("Deserialization happened");
}
catch(Exception e)
{
	System.out.println(e);
}
}
}

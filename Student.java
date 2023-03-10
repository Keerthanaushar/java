
import java.io.*;
public class Student implements Serializable
{
 public String name;
 public int age;
 public String gender;
 public Student(String name,int age,String gender)
 {
 this.name=name;
 this.age=age;
 this.gender=gender;
}
}

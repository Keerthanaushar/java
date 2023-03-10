import java.io.*;
public class Employee implements Serializable
{
 public String name;
 public int age;
 public int id;
 public Employee(String name,int age,int id)
 {
 this.name=name;
 this.age=age;
 this.id=id;
 }
}

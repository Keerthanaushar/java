package Networking;
public class SB
{
 public static void main(String[] args)
 {
 StringBuffer sb=new StringBuffer("Hello");
 StringBuffer sb1=new StringBuffer("Welcome");
 StringBuffer sb2=new StringBuffer("Myworld");
 StringBuffer sb3=new StringBuffer("APPLE");
 sb.append("java");
 int l=sb.length();
 sb.insert(1,"world");
 sb1.replace(1,2,"java");
 sb2.delete(1,2);
 
 System.out.println("after append "+ sb);
 System.out.println("Length "+ l);
 System.out.println("after insert "+ sb);
 System.out.println("after replace "+ sb1);
 System.out.println("after delete "+ sb2);
 System.out.println("capacity "+ sb2.capacity());
 System.out.println("reverse "+ sb3.reverse());
 }
}
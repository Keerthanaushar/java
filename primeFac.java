package primepackage;
import java.io.*;
public class primeFac
{
public void disp(int temp)
{
int i=2;
 while((temp!=0)&&(temp>0))
 {
if((temp==0)||(i<=0))
 {
 break;
 }else
 {
 if(temp%i==0)
 {
 System.out.println(i);
 temp=temp/i;
 }else
 {
 i=i+1;
 }
 }
 }
}
}

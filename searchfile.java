import java.io.File;
import java.util.*;
public class searchfile
{
static int i=0;
static int RecursivePrint(File[] arr, int level, String r)
{
for (File f : arr)
{
for (int i = 0; i < level; i++)
System.out.print("\t");
if(f.isDirectory())
{
RecursivePrint(f.listFiles(), level + 1,r);
}else
{
if(f.getName().equalsIgnoreCase(r))
{
i=1;}}}
return i;
}
public static void main(String[] args){
String maindirpath = " D://";
String f;
int v=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter file name to be searched :");
f=sc.nextLine();
File maindir = new File(maindirpath);
if(maindir.exists() && maindir.isDirectory())
{
File arr[] = maindir.listFiles();
v=RecursivePrint(arr, 0,f);}
if(v==1)
System.out.println("true");
else
System.out.println("false");}}
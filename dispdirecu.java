import java.io.File;
public class dispdirecu
{
static void RecursivePrint(File[] arr, int level)
{
for (File f : arr)
{
for (int i = 0; i < level; i++)
System.out.print("\t");
if(f.isDirectory())
{
System.out.println("Directory[" + f.getName() + "]");
RecursivePrint(f.listFiles(), level + 1);
}else
{
System.out.println("file"+f.getName());
}
}
}
public static void main(String[] args)
{
String maindirpath = "D:\\javamca";
File maindir = new File(maindirpath);
if(maindir.exists() && maindir.isDirectory())
{
File arr[] = maindir.listFiles();
RecursivePrint(arr, 0);
}
}
}

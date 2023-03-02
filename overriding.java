//WAP (menu driven) to demonstrate function overriding in java, by displaying details of a student, and a teacher.

import java.io.*;
class Teacher
{
    String name,dept;
    void read_data()
    {
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("Enter the Name of the teacher:");
			name=br.readLine();
			System.out.println("Enter the department of teacher:");
			dept=br.readLine();
		}catch(Exception e){}
    }
    void display_data()
    {
        System.out.println("The name of the teacher is "+name);
        System.out.println("The department of the teacher is "+dept);
    }
}
class Students extends Teacher
{
	 void read_data()
    {
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("Enter the Name of the student:");
			name=br.readLine();
			System.out.println("Enter the department of the student:");
			dept=br.readLine();
		}catch(Exception e){}
    }
    void display_data()
    {
        System.out.println("The name of the student is "+name);
        System.out.println("The department of the student is "+dept);
    }   
}
class overriding
{
    public static void main(String[] args)
    {
		int ch;
		try{
				DataInputStream br=new DataInputStream(System.in);
				System.out.println("MENU ");
				System.out.println("******");
				System.out.println("1.Detailof the teacher ");
				System.out.println("2.Detailof the student ");
				System.out.println("3.Exit");
				System.out.println("Enter your choice: ");
				ch=Integer.parseInt(br.readLine());
				switch(ch){
					case 1:	Teacher obj=new Teacher();
							obj.read_data();
							obj.display_data();
							break;
					case 2:	Teacher obj1=new Students();
							obj1.read_data();
							obj1.display_data();
							break;
					case 3:break;
				}
			}catch(Exception e){}
	}
}
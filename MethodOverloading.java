import java.io.*;
class MethodOverloading{
    public static void main(String args[]){
        Rectangle r= new Rectangle();
        r.Area();
        //another method with arguments
        r.Area(5.4F, 3.2F);
        //method for perimeter
        r.Perimeter();
        //another method for perimeter with arguments
        r.Perimeter(5.4F, 3.2F);
    }
}
class Rectangle{
    DataInputStream dis=new DataInputStream(System.in);
    public void Area(){
        try{
            System.out.println("Enter the length");
            int length=Integer.parseInt(dis.readLine());
            System.out.println("Enter the breadth");
            int breadth=Integer.parseInt(dis.readLine());
            int area =length*breadth;
            System.out.println("Area is "+area);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void Area(float length,float breadth){
        float area =length*breadth;
        System.out.println("Area is "+area);
    }
    public void Perimeter(){
        try{
            System.out.println("Enter the length");
            int length=Integer.parseInt(dis.readLine());
            System.out.println("Enter the breadth");
            int breadth=Integer.parseInt(dis.readLine());
            int perimeter =2*(length+breadth);
            System.out.println("Perimeter is "+perimeter);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void Perimeter(float length,float breadth){
        float perimeter =2*(length+breadth);
        System.out.println("Perimeter is "+perimeter);
    }
}
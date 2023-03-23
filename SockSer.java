package Networking;
import java.net.*;
import java.io.*;
public class SockSer {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Waiting for connection from client");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String str = (String)din.readLine();
			System.out.println("The message is "+str);
			ss.close();
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
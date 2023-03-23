package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientFact {

	public static void main(String[] args) {
		try
		{
			Socket s=new Socket("localhost",1235);
			System.out.println("Sending a request to server");
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter number whose factorial you want to find");
			String num="Fact";
			num+=din.readLine();
			
			dout.writeUTF(num);
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SockSerTwoWay {

public static void main(String[] args) {
	try
	{
		ServerSocket ss=new ServerSocket(1484);
		Socket as=ss.accept();
		DataInputStream ksin=new DataInputStream(System.in);//get input from keyboard
		DataInputStream ssin=new DataInputStream(as.getInputStream());//get input from the client socket
		DataOutputStream dout=new DataOutputStream(as.getOutputStream());//send output to client
		String st;
		dout.writeUTF("Set ");
		while(true)
		{
			st=ssin.readUTF();
			if(st.equals("#"))
			break;
			System.out.println("From client "+ st);
			System.out.println("Enter data you want to send/translate with # ");
			st=ksin.readLine();
			dout.writeUTF(st);
			if(st.equals("#"))
			break;
		}
		ss.close();
		as.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}
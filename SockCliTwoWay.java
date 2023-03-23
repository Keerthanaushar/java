package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SockCliTwoWay {

public static void main(String[] args) {
	try
	{
		Socket cs=new Socket("localhost",1484);
		DataInputStream kin=new DataInputStream(System.in);//get data from keyboard
		DataInputStream sin=new DataInputStream(cs.getInputStream());//get input from the server socket
		DataOutputStream dout=new DataOutputStream(cs.getOutputStream());//send input to server
		String st;
		while(true)
		{
			st=sin.readUTF();
			if(st.equals("#"))
			break;
			System.out.println("From server "+ st);
			System.out.println("Enter data you want to send/translate with # ");
			st=kin.readLine();
			dout.writeUTF(st);
			if(st.equals("#"))
			break;
		}
		cs.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}

}
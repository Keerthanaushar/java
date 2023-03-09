package net;
import java.io.IOException;
//connection-less
//DatagramSocket -> through which you send packets
//DtagramPacket -> data and metadata  
import java.net.*;
public class UDPCli2Way {

	public static void main(String[] args) throws IOException {
			int i=10;
			byte[] b=(String.valueOf(i)).getBytes();
			DatagramSocket ds=new DatagramSocket();
			InetAddress my=InetAddress.getLocalHost();
			DatagramPacket dp=new DatagramPacket(b,b.length,my,1520);//data(byte array),length
			ds.send(dp);
			System.out.println("Data is sent");
			
			DatagramSocket ds1=new DatagramSocket(1750);
			byte[] b2=new byte[2048];
			DatagramPacket dp1=new DatagramPacket(b2,b2.length);//data,length
			ds1.receive(dp1);
			System.out.println("Data is received again");
			String str2=new String(dp1.getData());
			int num=Integer.parseInt(str2.trim());
			int sq=num*num;
			System.out.println("Data2 is "+sq);//display 11^2=121
		
	}

}

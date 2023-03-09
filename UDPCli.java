package net;
import java.io.IOException;
//connection-less
//DatagramSocket -> through which you send packets
//DtagramPacket -> data and metadata  
import java.net.*;
public class UDPCli {

	public static void main(String[] args) throws IOException {
		try {
			int i=10;
			byte[] b=(String.valueOf(i)).getBytes();
			DatagramSocket ds=new DatagramSocket();
			InetAddress my=InetAddress.getLocalHost();
			DatagramPacket dp=new DatagramPacket(b,b.length,my,1220);//data(byte array),length
			ds.send(dp);
			System.out.println("Data is sent");
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

}

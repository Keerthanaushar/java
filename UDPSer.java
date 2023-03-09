package net;
import java.io.IOException;
//connection-less
//DatagramSocket -> through which you send packets
//DtagramPacket -> data and metadata  
import java.net.*;
public class UDPSer {

	public static void main(String[] args) throws IOException {

			byte[] b1=new byte[2048];
			DatagramSocket ds=new DatagramSocket(1220);
			DatagramPacket dp=new DatagramPacket(b1,b1.length);//data,length
			ds.receive(dp);
			String str=new String(dp.getData());
			int num=Integer.parseInt(str.trim());
			num++;
			System.out.println("Data is "+num);
	}

}

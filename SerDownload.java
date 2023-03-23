package Networking;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class SerDownload {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Waiting for connection from client");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String str = (String)din.readLine();
			String s1 = str.substring(str.indexOf("=") + 1);
			s1.trim();
			System.out.println("The message is "+s1);
			/*URL u = new URL(str);
			InputStream is = u.openStream();
			FileOutputStream os = new FileOutputStream("sample1.pdf");
			int l;
			byte[] b=new byte[2048];
			while((l=is.read(b))!=-1) {
				os.write(b,0,l);//offset wise......3arguments->byte,offset number,length
			}*/
			System.out.println("File downloaded");
			ss.close();
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

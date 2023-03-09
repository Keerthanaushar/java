package net;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Download {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the url to download: ");
			String link=sc.nextLine();
			URL u = new URL(link);
			String s=u.getFile();
			String ext=s.substring(s.indexOf(".") + 1);
			System.out.println("File type: "+ext);
			InputStream is = u.openStream();
			FileOutputStream os = new FileOutputStream("sample."+ext);
			int l;
			byte[] b=new byte[2048];
			while((l=is.read(b))!=-1) {
				os.write(b,0,l);//offset wise......3arguments->byte,offset number,length
			}
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
package com.kh.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class IPPort {

	public static void main(String[] args) {
		try {
			//String serverIP = InetAddress.getLocalHost().getHostAddress();
			String serverIP = "192.200.3.58";
			System.out.println(serverIP);
			Socket socket;
		
			socket = new Socket(serverIP,3000);
			System.out.println(socket);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

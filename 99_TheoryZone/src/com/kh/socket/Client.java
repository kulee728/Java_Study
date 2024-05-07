package com.kh.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {//무한루프 미완성
	public static void main(String[] args) {
		int port = 3000;
		try {
			String serverIpAddress = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIpAddress,port);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			String serverMessage;
			out.println("(Client) Server Connected");
			while((serverMessage=in.readLine())!=null) {
				System.out.println("(Client) Message from Server : "+serverMessage);
				out.println("(Client) client");
			}
			
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("client terminated");
	}
}

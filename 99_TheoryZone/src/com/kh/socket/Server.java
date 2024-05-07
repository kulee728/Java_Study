package com.kh.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {//무한루프 미완성
	public static void main(String[] args) {
		int port = 3000;
		try {
			String serverIP = "192.200.3.58";
			ServerSocket server = new ServerSocket(port,50, InetAddress.getByName(serverIP));
			
			Socket client = server.accept();
			System.out.println("(Server)Client Connected");
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			String clientMessage;
			while((clientMessage=in.readLine())!=null) {
				System.out.println("(Server) Message from Client : "+clientMessage);
				out.println("(Server) checking");
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

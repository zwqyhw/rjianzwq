package com.das;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	
	private DatagramSocket client;
	private int targetPort;

	public ChatSender(DatagramSocket ds, int i) {
		this.client=ds;
		this.targetPort=targetPort;
	}

	@Override
	public void run() {
		while(true) {
		try {
			Scanner sc=new Scanner(System.in);
				String data=sc.nextLine();
				byte[] buf;
				buf=data.getBytes();
				System.out.println("这条信息发给那个Ip:");
				String ip=sc.nextLine();
				DatagramPacket dp;
				dp=new DatagramPacket(buf,buf.length,InetAddress.getByName(ip),8900);
				client.send(dp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}

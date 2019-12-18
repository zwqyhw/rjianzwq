package com.das;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ChatReceiver implements Runnable {
 private DatagramSocket server;
	public ChatReceiver(DatagramSocket ds) {
		this.server=ds;
	}

	@Override
	public void run() {
			byte[] zjsz=new byte[1024];
			//创建要发送的数据报
			DatagramPacket fa=new DatagramPacket(zjsz,zjsz.length);
			while(true) {
				try {
				server.receive(fa);
				String str1=new String(fa.getData(),0,fa.getLength());
				System.out.println(str1);
				}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}

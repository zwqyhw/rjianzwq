package com.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Net_test1 {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(8900);
		//定义要发送的数据
		//将数据转换为二进制字节数组
		byte[] zjsz=new byte[1024];
		//创建要发送的数据报
		DatagramPacket faS=new DatagramPacket(zjsz,zjsz.length);
		System.out.println("等待接受数据...");
		while(true) {
			ds.receive(faS);
			String str1=new String(faS.getData(),0,faS.getLength());
			System.out.println(str1);
		}
	}

}

package com.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import com.mysql.fabric.xmlrpc.Client;

public class Net_test2 {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(4000);
		//定义要发送的数据
		String str="严皓玮";
		//将数据转换为二进制字节数组
		byte[] zjsz=str.getBytes();
		//创建要发送的数据报
		DatagramPacket faS=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息...");
		ds.send(faS);
		ds.close();
	}

}

package com.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test {

	public static void main(String[] args) throws Exception {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("本机的IP地址是:"+ip.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院WEB服务器的IP地址是:"+ip2.getHostAddress());
		if(ip2.isReachable(3000)) {
			System.out.println("从本机到江汉艺术职业学院WEB服务器3秒可达");
		}
		else {
			System.out.println("从本机到江汉艺术职业学院WEB服务器3秒不可达");
		}
	}

}

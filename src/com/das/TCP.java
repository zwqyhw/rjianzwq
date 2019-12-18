package com.das;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TCP {

	public static void main(String[] args) throws Exception {
		//创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		while (true) {
			Socket kd=fwqtjz.accept();
			int port=kd.getPort();
			String ip=kd.getInetAddress().getHostAddress();
			System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
			InputStream is=kd.getInputStream();
			byte[]zjhc=new byte[1024];
			FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+".jpg");
			int b=is.read(zjhc);
			while(b!=-1) {
				fout.write(zjhc,0,b);
				b=is.read(zjhc);
			}
			String xinxi="文件上传成功";
			zjhc=new byte[1024]; 
			OutputStream os=kd.getOutputStream();
			os.write(xinxi.getBytes());
			os.close();
			
		}
		

	}

}

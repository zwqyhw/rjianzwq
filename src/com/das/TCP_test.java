package com.das;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.commons.math3.random.ISAACRandom;

public class TCP_test {

	public static void main(String[] args) throws Exception, IOException {
		Socket k=new Socket("10.2.103.31",8899);
		OutputStream os=k.getOutputStream();
		//定义要上传的文件输入流
		//通过客户端套接字获取网络上传来的输入流
		FileInputStream in=new FileInputStream("d:\\1.jpg");
		//通过文件输入写入文件,并写入网络
		byte[]zjhc=new byte[1024];
		int b=in.read(zjhc);
		while (b!=-1) {
			//通过套接字获得的输出流写入网络;
			os.write(zjhc,0,b);
			b=in.read(zjhc);
		}
		k.shutdownOutput();
		InputStream iS=k.getInputStream();
		//将缓冲区中的内容读入到输入流中,最后放到整形变量b中
		b=iS.read(zjhc);
		while(b!=-1) {
			//将字节缓冲信息转换成可以识别的字符串写到控制台;
			System.out.println(new String(zjhc,0,b));
			b=iS.read(zjhc);
			
		}
		iS.close();
		k.close();
		

	}

}

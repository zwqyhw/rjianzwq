package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E81 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d:\\1.jpg");
		FileOutputStream fout=new FileOutputStream("d:\\2.jpg");
		long kssj=System.currentTimeMillis();
		byte[]zjhc=new byte[1024];
		int b=in.read(zjhc);
		while (b!=-1) {
			//System.out.print((char)b);
			fout.write(zjhc,0,b);
			b=in.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷貝圖片需要多少"+(jssj-kssj)+"毫秒");
			//fout.write(",come on".getBytes());
			//關閉流
			in.close();
			fout.close();
		}
		
	}



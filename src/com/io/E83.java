package com.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class E83 {

	public static void main(String[] args) throws Exception {
		//定义标准字节输入流
		//InputStream jp=System.in;
		//将标准字节输入流转换为字符流
		//InputStreamReader ir=new InputStreamReader(jp);
		//将字符流包装成缓冲字符流
		//BufferedReader br1=new BufferedReader(ir);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入年龄:");
		String line=br.readLine();
		System.out.println("您的年龄是:"+line);
		int age=Integer.parseInt(line);
		System.out.println("那么明年您将是"+(age+1)+"岁");

	}

}

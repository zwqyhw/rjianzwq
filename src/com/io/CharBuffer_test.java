package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbj=CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是"+cbj.capacity());
		System.out.println("这个字符缓冲区界限值是"+cbj.limit());
		System.out.println("这个字符缓冲区初始位置值是"+cbj.position());
		System.out.println(" ");
		//添加三个元素
		cbj.put('a');cbj.put('b');cbj.put('c');
		System.out.println("添加三个元素以后这个字符缓冲区容量是"+cbj.capacity());
		System.out.println("添加三个元素以后这个字符缓冲区界限值是"+cbj.limit());
		System.out.println("添加三个元素以后这个字符缓冲区初始位置值是"+cbj.position());
		System.out.println(" ");
		//执行反转方法
		cbj.flip();
		System.out.println("添加三个元素并反转以后这个字符缓冲区容量是"+cbj.capacity());
		System.out.println("添加三个元素并反转以后这个字符缓冲区界限值是"+cbj.limit());
		System.out.println("添加三个元素并反转以后这个字符缓冲区初始位置值是"+cbj.position());
		System.out.println(" ");
		//取出的一个元素
		System.out.println("取出的一个元素是"+cbj.get());
		System.out.println("添加三个元素并反转取出的一个元素以后这个字符缓冲区容量是"+cbj.capacity());
		System.out.println("添加三个元素并反转取出的一个元素以后这个字符缓冲区界限值是"+cbj.limit());
		System.out.println("添加三个元素并反转取出的一个元素以后这个字符缓冲区初始位置值是"+cbj.position());
	}

}

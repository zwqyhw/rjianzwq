package com.io;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Wenjiankaobei {

	public static void main(String[] args) throws Exception {
		//源文件
		RandomAccessFile ywj=new RandomAccessFile("d:\\yhw.jpg","rw");
		//获取源通道
		FileChannel fc=ywj.getChannel();
		//目标文件
		RandomAccessFile mbwj=new RandomAccessFile("zwq.jpg","rw");
		//获取目标通道
		FileChannel mbfc=mbwj.getChannel();
		//执行复制
		long cg=fc.transferTo(0,fc.size(),mbfc);
		if(cg>0) {
			System.out.println("复制成功");
		}
		ywj.close();
		fc.close();
		mbfc.close();
		mbwj.close();
	}

}

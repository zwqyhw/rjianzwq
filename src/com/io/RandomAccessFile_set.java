package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFile_set {

	public static void main(String[] args) throws Exception {
	 RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
	 int time=Integer.parseInt(raf.readLine())-1;
	 if(time>0) {
		 System.out.println("您还可以尝试"+time+"次");
		 //回到文件开始位置
		 raf.seek(0);
		 raf.write((time+"").getBytes());
	 }else
	 {
		 System.out.println("您的次数已经用完了");
	 }
	 raf.close();

	}

}

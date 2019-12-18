package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class E82 {

	public static void main(String[] args) throws Exception {
		FileReader in=new FileReader("d:\\ese.txt");
		FileWriter is=new FileWriter("poem1.txt");
		char[]buff=new char[2048];
		int b=in.read(buff);
		while (b!=-1) {
			is.write(buff,0,6);
			b=in.read(buff);
		}
		in.close();
		is.close();
	}

}

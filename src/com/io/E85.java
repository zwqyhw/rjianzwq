package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class E85 {

	public static void main(String[] args) {
		File ml=new File("E:\\java基础");
		fileDir(ml);
	}

	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		for(File files:wjsz) {
			if(files.isDirectory()) {
				fileDir(files);
			}else if(files.isFile()) {
				if(files.getName().endsWith(".java"))
				System.out.println(files);
			}
		}
	}
}

	
		
		


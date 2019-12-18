package com.zfc;

import java.io.IOException;

public class E50 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机处理器个数是"+rt.availableProcessors()+"个");
		System.out.println("最小内存是:"+rt.freeMemory()/1024/1024+"MBtyes");
		System.out.println("最大内存是:"+rt.maxMemory()/1024/1024+"MBtyes");
		Process jingcheng = rt.exec("notepad.exe");
		Thread.sleep(3000);
		jingcheng.destroy();
		
		
		

	}

}

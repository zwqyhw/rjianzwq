package com.zfc;

public class E48 {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		int sum=0;
		for (long i = 0; i < 100000000000l; i++) {
			sum+=1;
			
		}
		long js=System.currentTimeMillis();
		System.out.println("0到10亿需要:"+(js-startTime)+"毫秒");
	}

}

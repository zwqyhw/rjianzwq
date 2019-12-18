package com.zfc;

import java.util.Random;

public class E52 {

	public static void main(String[] args) {
		System.out.println("生成[0,1)之间int类型的浮点数:"+Math.random());
		Random r=new Random();
		System.out.println("生成[0,1)之间int类型的浮点数:"+r.nextDouble());
		//生成整数
		System.out.println("随机生成-21亿到21亿之间的一个整数:"+r.nextInt());
		System.out.println("随机生成10以内不包括10单包含0的一个整数:"+r.nextInt(10));
	}

}

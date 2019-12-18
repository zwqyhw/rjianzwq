package com.zfc;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class E51 {

	public static void main(String[] args) {
		System.out.println("计算绝对值的结果:"+Math.abs(-1));
		System.out.println("计算正弦的结果:"+Math.sin(1.57));
		System.out.println("计算平方根的结果:"+Math.sqrt(5));
		System.out.println("计算立方根的结果:"+Math.cbrt(9));
		System.out.println("计算乘方的结果:"+Math.pow(2,2));
		System.out.println("计算大于参数的最小整数:"+Math.ceil(4.6));
		System.out.println("计算小于参数的最大整数:"+Math.floor(-5.2));
		System.out.println("对小数进行四舍五入后的结果:"+Math.round(-2.2));
		System.out.println("求两个小数的较大值:"+Math.max(2.1,5.2));
		System.out.println("求两个小数的较小值:"+Math.min(2.1,5.2));
		System.out.println("生成一个大于等于0.0小于1.0的随机数:"+Math.random());
		System.out.println("对小数进行取整结果:"+(int)(-3.6));
	}

}

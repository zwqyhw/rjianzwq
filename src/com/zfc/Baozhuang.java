package com.zfc;
//Integer 是int类型的包装类
public class Baozhuang {

	public static void main(String[] args) {
		int a=20;
		//自动装箱:将int这个基本数据类型的变量装到Integer这个引用数据类型的对象中
		Integer b=a;
		//自动拆箱:将Integer这个引用数据类型的对象拆开变成int这个基本数据类型的变量
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//将字符串转成整数的三种方法
		String chengji="88";
		String s=chengji+10;
		System.out.println("No.1:包装类的valueOf方法:"+(Integer.valueOf(chengji)+10));
		System.out.println("No.2:包装类的parsexxx方法:"+(Integer.parseInt(chengji)+10));
		System.out.println("No.3:包装类的构造方法:"+(new Integer(chengji)+10));
		
		Integer rz=88;
		System.out.println(rz);
		System.out.println("No.1:包装类的valueOf方法:"+String.valueOf(rz));
		System.out.println("No.2:String类的toString方法:"+rz.toString(rz));
		System.out.println("No.3:空串连接整数法:"+rz+" ");
	}

}

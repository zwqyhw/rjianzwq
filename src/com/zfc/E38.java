package com.zfc;

public class E38 {

	public static void main(String[] args) {
		String str1=new String("没有构造方法");
		String str2=new String("有构造方法");
		String str3=new String();
		char[] zfcs={'a','b','c','d'};
		String str4=new String(zfcs);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println('a'+str3+'b');
		System.out.println(str4);
		
	}

}

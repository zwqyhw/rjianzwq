package com.zfc;

public class E39 {

	public static void main(String[] args) {
		//字符串可以看成是多个字符组成的字符数组
		String s="abcabcbacba";
		System.out.println("字符串长度为:"+s.length());
		System.out.println("字符串中第一个字符:"+s.charAt(0));
		//java方法命名一般采用驼峰命名原则
		System.out.println("字符c第一次出现的位置:"+s.indexOf('c'));
		System.out.println("字符c最后一次出现的位置:"+s.lastIndexOf('c'));
		System.out.println("字符串第一次出现的位置:"+s.indexOf("ab"));
		System.out.println("字符串最后一次出现的位置:"+s.lastIndexOf("ab"));
		
	}
}

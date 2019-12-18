package com.zfc;
public class E40 {

	public static void main(String[] args) {
		String s1="abcabcbacba.jpg";
		if(s1.startsWith("a")) {
			System.out.println("字符串s1以a开头");
		}
		if(s1.endsWith("jpg")) {
			System.out.println("字符串s1以jpg结尾");
		}
		if(s1.contains("cba")) {
			System.out.println("字符串s1包含cba这个子串");
		}
		if(!s1.isEmpty()) {
			System.out.println("字符串s1不是空字符串");
		}	
		}
	}



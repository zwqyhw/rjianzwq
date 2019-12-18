package com.zfc;

public class E46 {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		StringBuffer ss=new StringBuffer("abc");
		StringBuffer ss1=new StringBuffer("abc");
		System.out.println(ss==ss1);
		System.out.println(ss.equals(ss1));

	}

}

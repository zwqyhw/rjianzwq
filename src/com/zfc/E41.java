package com.zfc;

public class E41 {

	public static void main(String[] args) {
		String s1="ab我d51爱asf5周4654雯cabc5倩bac3ba.jpg";
		System.out.println("这个字符串里的数字是:");
		char[] zfsz=s1.toCharArray();
		for (char zf:zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf+",");
			}
		}
		System.out.println("这个字符串里的汉字是:");
		for (char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
}
	}



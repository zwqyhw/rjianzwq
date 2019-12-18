package com.zfc;

public class E43 {

	public static void main(String[] args) {
	String str="2019-10-12";
	System.out.print("今天是:"+str.substring(0,4)+"年");
	System.out.print(""+str.substring(5,7)+"月");
	System.out.println(""+str.substring(8)+"日");
	String[] zfcsz=str.split("-");
	System.out.println("今天是:"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日");
	}

}

package com.zfc;

public class E49 {

	public static void main(String[] args) {
		int s[]= {1,2,3,4,5,6};
		int ss1[]= {8,2,3,58,90,6};
		System.arraycopy(s,2,ss1,0,4);
		for (int i = 0; i < ss1.length; i++) {
			System.out.println(ss1[i]);
			
		}
	}

}

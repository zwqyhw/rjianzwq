package com.jihe;

public class E64 {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
	  for(@SuppressWarnings("unused") String mgys: strs) {
		  mgys="ddd";
	}
	  System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	  
	  for(int i=0;i<strs.length;i++) {
		  strs[i]="ddd";
	  }
	  System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
}
}
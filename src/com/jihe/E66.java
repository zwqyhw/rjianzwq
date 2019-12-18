package com.jihe;


import java.util.HashSet;

public class E66 {

	public static void main(String[] args) {
		//Hashset能够去掉重复元素,是因为Hashset里的元素以及重写了hashCade()以及equals()方法
		HashSet<String> arraylist = new HashSet<String>();
		arraylist.add("sut1");
		arraylist.add("sut2");
		arraylist.add("sut3");
		arraylist.add("sut4");
		arraylist.add("sut4");
		arraylist.forEach(obj->System.out.println(obj));

		//Hashset能够去掉重复元素,是因为Hashset里的Integer以及重写了hashCade()以及equals()方法
		arraylist.removeAll(arraylist);
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("4");
		System.out.println("来至哈希集的输出");
		arraylist.forEach(obj->System.out.println(obj));

	}

}

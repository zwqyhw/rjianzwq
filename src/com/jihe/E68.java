package com.jihe;

import java.util.TreeSet;

public class E68 {

	public static void main(String[] args) {
		//如果往TreeSet里插入整数,由于整数所在的Integer类impments Comparable这个接口,所以TreeSet可以对他们进行排序
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(3);
		tr.add(9);
		tr.add(1);
		tr.add(21);
		System.out.println("创建的Treeset集合为:"+tr);
		System.out.println("TreeSet集合首元素是:"+tr.first());
		System.out.println("集合中大于或等于9的最大值是:"+tr.floor(9));
		System.out.println("集合中大于9的最小值是:"+tr.higher(9));
		System.out.println("删除第一个元素是:"+tr.first());

	}

}

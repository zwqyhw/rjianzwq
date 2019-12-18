package com.jihe;
import java.util.ArrayList;
import java.util.LinkedList;

public class E61 {

	public static void main(String[] args) {
		//<>是泛型,里面的類型是集合里元素的類型
		//有兩個類,前面的一個是集合類,後面尖括號里的是集合里的元素類型
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("sut1");
		arraylist.add("sut2");
		arraylist.add("sut3");
		arraylist.add("sut4");
		System.out.println("集合的长度是:"+arraylist.size());
		System.out.println("第二 个元素是:"+arraylist.get(1));
		
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("sut1");
		linkedlist.add("sut2");
		linkedlist.offer("offer");
		linkedlist.push("push");
		System.out.println("鏈表的长度是:"+linkedlist.size());
		System.out.println("鏈表的最後一個个元素是:"+linkedlist.getLast());
		System.out.println("鏈表的第一個个元素是:"+linkedlist.getFirst());
		System.out.println(linkedlist);
		
		String dygys=linkedlist.peek();
		System.out.println("鏈表linkedlist的第一個元素是:"+dygys);
		
		linkedlist.removeFirst();
		linkedlist.pollLast();
		System.out.println(linkedlist);
	}
}

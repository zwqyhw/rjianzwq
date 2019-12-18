package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E63 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("sut1");
		arraylist.add("sut2");
		arraylist.add("sut3");
		arraylist.add("sut4");
		System.out.println("數組集合的长度是:"+arraylist.size());
		System.out.println("數組第二 个元素是:"+arraylist.get(1));
		//使用迭代讀取集合中的每個元素
		Iterator<String> diedai=arraylist.iterator();
		//hasNext判斷是否有下一個元素
		while (diedai.hasNext()) {
			//next方法讀取下一個元素
			String dgys=diedai.next();
			System.out.println(dgys);	
		}
		
		System.out.println("使用迭代輸出每個元素");
		for(String mgys:arraylist) {
			System.out.println(mgys);
		}
		
		System.out.println("利用列表集合使用JDK8forEach语句输出:");
		arraylist.forEach(obj->System.out.println(obj));
		
		System.out.println("利用迭代集合使用JDK8forEach语句输出:");
		Iterator<String> array2=arraylist.iterator();
		array2.forEachRemaining(obj->System.out.println(obj));
	}
}

package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class E76 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list, "严","周","钱","邵","孙");
		System.out.println("排序前:"+list);
		
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		
		Collections.sort(list);
		System.out.println("自然排序后:"+list);
		
		Collections.shuffle(list);
		System.out.println("随机排序后:"+list);
		
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换排序后:"+list);
		
		System.out.println("==================");
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		Collections.addAll(list1,-3,2,9,5,8);
		System.out.println("集合中的元素是:"+list1);
		System.out.println("集合中的最大元素:"+Collections.max(list1));
		System.out.println("集合中的最小元素:"+Collections.min(list1));
		
		Collections.replaceAll(list1, 8,0);
		System.out.println("替换后的集合:"+list1);
		
		Collections.sort(list1);
		System.out.println("集合排序后:"+list1);
		
		int index=Collections.binarySearch(list1,9);
		System.out.println("集合通过二分查找方法查找元素9所在位置:"+index);
	}
	

}

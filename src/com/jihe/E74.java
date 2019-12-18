package com.jihe;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class CustomComparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String key1=(String) obj1;
		String key2=(String) obj2;
		return key2.compareTo(key1);
	}
}
public class E74 {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>(new CustomComparator());
		map.put("2", "Rose");
		map.put("1", "jack");
		map.put("3", "Eve");
		System.out.println(map);

	}
 
}

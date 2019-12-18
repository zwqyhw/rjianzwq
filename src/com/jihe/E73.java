package com.jihe;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E73 {

	public static void main(String[] args) {
		Map<String, String> hmap=new TreeMap<String, String>();
		hmap.put("1","jack");
		hmap.put("5","home");
		hmap.put("2","Eva");
		hmap.put("4","sdx");
		hmap.put("3","fa");
		System.out.println(hmap);
		System.out.println("这个双列集合所有键值是:"+hmap.keySet());
		
		
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
			}	
	}
}

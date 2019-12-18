package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class E72 {

	public static void main(String[] args) {
		//赋值符号左边的类或接口可以是右边的类的上一代
		Map<String, String> hmap=new HashMap<String, String>();
		hmap.put("1","jack");
		hmap.put("2","home");
		hmap.put("3","Eva");
		System.out.println(hmap);
		if(hmap.containsKey("1")) {
				System.out.println("这个双列集合包含1");;
				System.out.println("这个双列集合包含中键1的值是:"+hmap.get("1"));
		}
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		//将双列集合Map变成单列的键对象集合使用values()方法
		System.out.println("这个双列集合所有键值是:"+hmap.keySet());
		System.out.println("这个双列集合所有键值是:"+hmap.values());
		//将键为1的值改成Andy
		hmap.replace("1", "Andy");
		System.out.println(hmap);
		//删除键1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用Keyset()方法
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
			}
			
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用Keyset()方法
		Set<Map.Entry<String,String>>  jianzhiduiji=hmap.entrySet();
		Iterator<Map.Entry<String,String>>  diedai2=jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry jianzhidui=(Map.Entry) diedai2.next();
			Object key = jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);                                                                                               
		}	
		System.out.println("用farEach键值对集遍历双列集合的键和值");
		hmap.forEach((key,value) ->System.out.println(key+":"+value));
		
		System.out.println("用farEach键值对集遍历双列集合的所有值");
		Collection<String> value=hmap.values();
		value.forEach(v->System.out.println(v));	
		
		System.out.println("===================");
		Map<String, String> hmap1=new HashMap<String, String>();
		hmap1.put("1","jack");
		hmap1.put("3","Eva");
		hmap1.put("2","home");
		hmap1.forEach((key,value1) ->System.out.println(key+":"+value1));
		
		
		System.out.println("===================");
		Map<String, String> hmap2=new LinkedHashMap<String, String>();
		hmap2.put("1","jack");
		hmap2.put("3","Eva");
		hmap2.put("2","home");
		hmap2.forEach((key,value1) ->System.out.println(key+":"+value1));
	}

}

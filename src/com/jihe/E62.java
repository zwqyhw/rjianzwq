package com.jihe;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class E62 {

	public static void main(String[] args) {
		//數組列表從頭部開始插入元素時,每次後面的每一個元素都要移動一個位置,消耗大量的時間	
		Test test=new Test();
			ArrayList<Integer>arrayList=new ArrayList<Integer>();
			long kssj1=System.currentTimeMillis();
			test.listInsert(arrayList);
			long jssj1=System.currentTimeMillis();
			System.out.println("數組列表頭部插入15萬個元素耗時:"+(jssj1-kssj1)+"毫秒");
			
			
			
			LinkedList<Integer>linkedList=new LinkedList<Integer>();
			long kssj2=System.currentTimeMillis();
			test.listInsert(linkedList);
			long jssj2=System.currentTimeMillis();
			System.out.println("鏈錶頭部插入15萬個元素耗時"+(jssj2-kssj2)+"毫秒");
	
			
			long kssj3=System.currentTimeMillis();
			test.listRead(arrayList);
			long jssj3=System.currentTimeMillis();
			System.out.println("數組尾部讀取15萬個元素耗時:"+(jssj3-kssj3)+"毫秒");
			
			long kssj4=System.currentTimeMillis();
			test.listInsert(arrayList);
			long jssj4=System.currentTimeMillis();
			System.out.println("鏈錶尾部讀取15萬個元素耗時:"+(jssj4-kssj4)+"毫秒");
			
			
	}
}
class Test{
	public void listInsert(List<Integer> list){
		for (int i = 0; i <150000; i++) {
			list.add(0, i);
			
		}
	}
	public void listRead(List<Integer> list) {
		for (int i = 150000-1; i>=0; i--) {
			list.get(i);
			
		}
		
	}
}


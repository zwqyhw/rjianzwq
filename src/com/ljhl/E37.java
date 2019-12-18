package com.ljhl;
class person{
	public void finalize() {
		System.out.println("对象将被作为垃圾回收");
	    }
}
public class E37 {

	public static void main(String[] args) {
			person p1=new person();
			p1=null;
			for (int i = 0; i < 10; i++) {
			System.out.println("方法一循环中");
		}
			person p2=new person();
			p2=null;
			System.gc();
			for (int i = 0; i < 10; i++) {
			System.out.println("方法二循环中");
				
		}
		
		}

}



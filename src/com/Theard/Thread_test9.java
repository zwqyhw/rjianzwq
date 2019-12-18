package com.Theard;
class YieidThead extends Thread{

	public YieidThead(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		for(int i=0;i<5;i++){
		System.out.println(Thread.currentThread().getName()+"---"+i);
		if(i==2) {
			System.out.println("线程让步:");
			Thread.yield();
			}
		}
	}
}
public class Thread_test9 {

	public static void main(String[] args) {
		new YieidThead("线程1").start();
		new YieidThead("线程2").start();
	}

}

package com.Theard;

class Mythread2 implements Runnable{
	public void run() {
		int i=0;
		while (i<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		i=i+1;
		}
	}
}
public class Thread_test2 {

	public static void main(String[] args) {
		Mythread2 mt1=new Mythread2();
		new Thread(new Mythread2(),"线程1").start();
		new Thread(new Mythread2(),"线程2").start();

	}

}
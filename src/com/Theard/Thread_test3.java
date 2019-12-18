package com.Theard;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Mythread3 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		}
		return i;
	}
}
public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Mythread3 mt1=new Mythread3();
		FutureTask<Object> ft1=new FutureTask(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		Mythread3 mt2=new Mythread3();
		new Thread(new FutureTask(mt2),"线程2").start();
		new Thread(new FutureTask(new Mythread3()),"线程3").start();
		System.out.println("线程1返回的结果是"+ft1.get());

	}

}

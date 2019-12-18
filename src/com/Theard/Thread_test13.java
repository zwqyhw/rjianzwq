package com.Theard;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow4 implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
		
	public void run() {
		while (true) {
			lock.lock();
			if(tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					//线程卖完后解锁
					lock.unlock();
				}
				if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
				}
			}
		}
	}
}
public class Thread_test13 {

	public static void main(String[] args) {
		TicketWindow4 tw=new TicketWindow4();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}
}

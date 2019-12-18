package com.Theard;

class TicketWindow3 implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	public void run() {
		while (true) {
			maipiao();
	
				}
			}
	private synchronized void maipiao() {
			if(tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
		}
	}
public class Thread_test12 {

	public static void main(String[] args) {
		TicketWindow3 tw=new TicketWindow3();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}
}

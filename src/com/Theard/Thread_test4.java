package com.Theard;
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		while (true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();

	}

}

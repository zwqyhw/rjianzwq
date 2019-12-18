package com.Theard;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;

class DeadLockThread implements Runnable{
static Object chopsticks=new Object();
static Object knifeAndFork=new Object();
private boolean flag;
DeadLockThread(boolean flag){
	this.flag=flag;
}	

	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
				
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
	
					}
				}
			}
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();
	}

}

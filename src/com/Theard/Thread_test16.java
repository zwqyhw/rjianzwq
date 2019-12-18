package com.Theard;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.poi.hssf.record.CFHeader12Record;

public class Thread_test16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=1;i<11;i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行i:"+i);
			}
			return sum;
		});
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=11;i<21;i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行i:"+i);
			}
			return sum;
		});
		int total=cf1.get()+cf2.get();
		System.out.println("两个线程求和结果"+total);
	}

}

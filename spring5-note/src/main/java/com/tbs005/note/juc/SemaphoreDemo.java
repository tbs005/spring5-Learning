package com.tbs005.note.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo implements  Runnable{

	final Semaphore smp = new Semaphore(5);
	@Override
	public void run() {
		try {
			smp.acquire();
			Thread.sleep(2000);//模仿程序处理业务
			System.out.println(Thread.currentThread().getId()+":done!");
			smp.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(20);
		final SemaphoreDemo demo = new SemaphoreDemo();
		for (int i = 0; i < 20; i++) {
			exec.submit(demo);
		}
	}
	

}





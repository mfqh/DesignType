package com.mfqh.uniquedes;

import java.util.concurrent.CountDownLatch;
/**
 * 使用多线程，测试各种单例设计模式的效率
 * @author 81493
 *
 */

public class TestUnique {
	public static void main(String[] args) throws InterruptedException {
		
		Long agoTime = System.currentTimeMillis();
		
		final int count = 10;
		//同步辅助类，让线程等待
		CountDownLatch myLatch = new CountDownLatch(count);
		
		for(int i=0; i<=count; i++) {
			new Thread(()->{
				
				for(int j=0; j<=10000000; j++) {
					@SuppressWarnings("unused")
					HungryUnique la = HungryUnique.getInstance();
				}
				
				myLatch.countDown(); //执行完毕之后，使得计数器减一
			}).start();	
		}
		
		myLatch.await();          //使得主线程暂时阻塞
		Long afterTime = System.currentTimeMillis();
		System.out.println(afterTime - agoTime);
		
		EnumUnique dUnique = EnumUnique.instance;
		dUnique.operation();
		
	}

}

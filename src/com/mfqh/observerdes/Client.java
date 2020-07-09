package com.mfqh.observerdes;
/**
 * 测试观察者模式
 * @author 81493
 *
 */

public class Client {

	public static void main(String[] args) {
		SubjectA subject = new SubjectA();
		
		ObserverA oA01 = new ObserverA();
		ObserverA oA02 = new ObserverA();
		ObserverA oA03 = new ObserverA();
		
		subject.addObserver(oA01);
		subject.addObserver(oA02);
		subject.addObserver(oA03);
		
		subject.tranState(100);
		System.out.println(oA01.getState());
		System.out.println(oA02.getState());
		System.out.println(oA03.getState());
		System.out.println("__________________________");
		
		subject.tranState(1000);
		System.out.println(oA01.getState());
		System.out.println(oA02.getState());
		System.out.println(oA03.getState());
		
		
		
	}
}

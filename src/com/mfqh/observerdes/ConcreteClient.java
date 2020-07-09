package com.mfqh.observerdes;

public class ConcreteClient {
	
	public static void main(String[] args) {
		ConcreteSubject cSubject = new ConcreteSubject();
		
		ConcreteObserver observer01 = new ConcreteObserver();
		ConcreteObserver observer02 = new ConcreteObserver();
		ConcreteObserver observer03 = new ConcreteObserver();
		
		cSubject.addObserver(observer01);
		cSubject.addObserver(observer02);
		cSubject.addObserver(observer03);
		
		cSubject.setState(100);
		System.out.println(observer01.getMyState());
		System.out.println(observer02.getMyState());
		System.out.println(observer03.getMyState());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		
		cSubject.setState(1000);
		System.out.println(observer01.getMyState());
		System.out.println(observer02.getMyState());
		System.out.println(observer03.getMyState());
	}

}

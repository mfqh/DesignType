package com.mfqh.flyweightdes;

public class Client {
	

	public static void main(String[] args) {

		FlyWeight f1 = FlyWeightFactory.getWeight("黑色");
		System.out.println(f1);
		FlyWeight f2 = FlyWeightFactory.getWeight("黑色");
		System.out.println(f2);
		FlyWeight f3 = FlyWeightFactory.getWeight("白色");
		System.out.println(f3);
		
		f1.display(new UnsharedConcreteFlyWeight(10,10));
		f2.display(new UnsharedConcreteFlyWeight(20,20));
		f3.display(new UnsharedConcreteFlyWeight(30,30));
	}
}

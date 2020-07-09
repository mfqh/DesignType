package com.mfqh.bridgedes;

public class BrandApple extends Brand{

	public BrandApple() {}
	
	public BrandApple(Produce myProduce) {
		super(myProduce);
	}
	
	public void makeUp() {
		System.out.println("苹果工厂");
		System.out.println("   |  ");
		System.out.println("   |  ");
		System.out.println("   |  ");
		System.out.println("   V  ");
		super.myProduce.makeUp();
	}
}

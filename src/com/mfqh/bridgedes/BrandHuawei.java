package com.mfqh.bridgedes;

public class BrandHuawei extends Brand{
	
	public BrandHuawei() {}
	
	public BrandHuawei(Produce myProduce) {
		super(myProduce);
	}
	
	public void makeUp() {
		System.out.println("华为工厂");
		System.out.println("   |  ");
		System.out.println("   |  ");
		System.out.println("   |  ");
		System.out.println("   V  ");
		super.myProduce.makeUp();
	}

}

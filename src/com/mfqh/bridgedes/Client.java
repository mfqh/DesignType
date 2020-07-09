package com.mfqh.bridgedes;

/**
 * 测试类
 * @author 81493
 *
 */


public class Client {
	
	public static void main(String[] args) {
		Produce pcProduce = new ProducePC();
		Produce phProduce = new ProducePhone();
		
		BrandApple appBrand = new BrandApple(pcProduce);
		appBrand.makeUp();
		BrandHuawei huaBrand = new BrandHuawei(phProduce);
		huaBrand.makeUp();
	}
}

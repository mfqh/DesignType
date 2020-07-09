package com.mfqh.bridgedes;

/**
 * 桥接类：
 * 使用组合的模式和被桥接的接口所关联
 * @author 81493
 *
 */

public class Brand {
	
	protected Produce myProduce;
	
	public Brand() {}

	public Brand(Produce myProduce) {
		super();
		this.myProduce = myProduce;
	}
	
}

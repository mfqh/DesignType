package com.mfqh.flyweightdes;
/**
 * 抽象享元类：
 *声明公共方法
 * @author 81493
 *
 */

public interface FlyWeight {
	
	String getColor();
	void display(UnsharedConcreteFlyWeight ucWeight);

}

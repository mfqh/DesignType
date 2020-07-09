package com.mfqh.factorydes;

/**
 * 抽象工厂模式
 * 
 * 可以创建一个产品组/线
 * 只对扩展产品组开放，对单个产品的扩增不开放
 * @author 81493
 *
 */

interface AbstrFactory {
	
	Product getProduct();
	
	OtherProduct getOtherProduct();

}

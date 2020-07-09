package com.mfqh.factorydes;

/**
 * 简单工厂模式
 * 
 * 不符合开闭原则：对修改关闭，对扩展开放
 * 但结构较简单，一般多使用
 * @author 81493
 *
 */

public class SimpleFactory {
	
	public Product getProduct(String str) {
		if(str.equals("ProductOne")) {
			return new ProductOne();
		}else if(str.equals("ProductTwo")){
			return new ProductTwo();
		}
		
		return null;		
	}
	
	public ProductOne getProductOne() {
		return new ProductOne();
	}
	
	public ProductTwo getProductTwo() {
		return new ProductTwo();
	}
	
}

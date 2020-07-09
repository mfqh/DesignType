package com.mfqh.factorydes;
/**
 * 获取Two类型的工厂
 * @author 81493
 *
 */

public class AbstrFactoryTwo implements AbstrFactory{

	@Override
	public Product getProduct() {

		return  new ProductTwo();
	}

	@Override
	public OtherProduct getOtherProduct() {
	
		return new OtherProductTwo();
	}

}

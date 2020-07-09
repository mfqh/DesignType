package com.mfqh.factorydes;

/**
 * 获取One类型工厂
 * @author 81493
 *
 */

public class AbstrFactoryOne implements AbstrFactory{

	@Override
	public Product getProduct() {
		
		return new ProductOne();
	}

	@Override
	public OtherProduct getOtherProduct() {

		return new OtherProductOne();
	}

}

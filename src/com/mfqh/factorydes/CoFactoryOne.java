package com.mfqh.factorydes;


public class CoFactoryOne implements CoFactory{

	@Override
	public Product getProduct() {
		
		return new ProductOne();
	}

}

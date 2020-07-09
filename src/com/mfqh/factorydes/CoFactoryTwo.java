package com.mfqh.factorydes;

public class CoFactoryTwo implements CoFactory{

	@Override
	public Product getProduct() {

		return new ProductTwo();
	}

}

package com.mfqh.adapterdes;

/**
 * 具体适配器：
 * 使用组合的方式
 * @author 81493
 *
 */

public class TarAdapter implements Adapter{

	private Adaptee myAdaptee;

	public TarAdapter() {}

	public TarAdapter(Adaptee myAdaptee) {
		this.myAdaptee = myAdaptee;
	}



	public void action() {
		System.out.println("进行适配");
		myAdaptee.getAdaptee();
		System.out.println("适配结束");	
	}

}

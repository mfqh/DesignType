package com.mfqh.proxydes;

/**
 * 静态代理对象
 * @author 81493
 *
 */

public class StaticProObject implements AllObject {
	
	private ReallObject rObject;
	
	public StaticProObject() {}

	public StaticProObject(ReallObject rObject) {
		this.rObject = rObject;
	}
	
	@Override
	public void oneThing() {
		System.out.println("开始做第一件事");
	
	}

	@Override
	public void twoThing() {
		System.out.println("开始做第二件事");
	}

	@Override
	public void mainThing() {
		rObject.mainThing();
	}

	@Override
	public void threeThing() {
		System.out.println("还有一件事");
	}

	@Override
	public void fourThing() {
		System.out.println("还有一件事");
	}

}

package com.mfqh.proxydes;
/**
 * 真实对象
 * @author 81493
 *
 */

public class ReallObject implements AllObject {

	@Override
	public void oneThing() {
		System.out.println("one");
	}

	@Override
	public void twoThing() {
		System.out.println("two");
	}

	@Override
	public void mainThing() {
		System.out.println("妖魔鬼怪快离开，妖魔鬼怪快离开");
		
	}

	@Override
	public void threeThing() {
		System.out.println("three");
	}

	@Override
	public void fourThing() {
		System.out.println("four");
	}

}

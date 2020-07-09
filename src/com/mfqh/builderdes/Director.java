package com.mfqh.builderdes;
/**
 * 装配者：
 * 将所创建的东西连接起来
 * @author 81493
 *
 */

public class Director {
	
	private AbsBuilder myBuilder;
	
	public Director() {}
	
	public Director(HouseBuilder hBuilder) {
		this.myBuilder = hBuilder;
	}
	
	public House getBuHouse() {
		House myHouse = new House();
		System.out.println("准备装配门");
		myHouse.setMyDoor(myBuilder.BuilderDoor());
		System.out.println("装配门完毕");
		System.out.println("准备装配窗");
		myHouse.setMyWindows(myBuilder.BuilderWindows());
		System.out.println("装配窗完毕");
		System.out.println("准备装配地板");
		myHouse.setMyFloor(myBuilder.BuilderFloor());
		System.out.println("装配地板完毕");
		return myHouse;
	}

}

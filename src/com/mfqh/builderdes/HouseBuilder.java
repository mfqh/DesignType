package com.mfqh.builderdes;

/**
 * 具体建造者：
 * 相当于工厂，建立组件对象
 */

public class HouseBuilder implements AbsBuilder{
	
	private final String strFloor = new String("竹制地板");
	private final String strDoor = new String("高级防盗门");
	private final String strWindows = new String("铝制窗户");

	@Override
	public ObjFloor BuilderFloor() {
		System.out.println("创建地板");
		ObjFloor myFloor = new ObjFloor(strFloor);
		return myFloor;
	}

	@Override
	public ObjDoor BuilderDoor() {
		System.out.println("创建门");
		ObjDoor myDoor = new ObjDoor(strDoor);
		return myDoor;
	}

	@Override
	public ObjWindows BuilderWindows() {
		System.out.println("创建窗");
		ObjWindows myWindows = new ObjWindows(strWindows);
		return myWindows;
	}

}

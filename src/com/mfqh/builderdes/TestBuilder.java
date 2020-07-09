package com.mfqh.builderdes;

public class TestBuilder {
	
	public static void main(String[] args) {
		//创建装配者
		Director myDirector = new Director(new HouseBuilder());
		
		//获得建造所得的对象
		House myHouse = myDirector.getBuHouse();
		
		System.out.println(myHouse);
	}

}

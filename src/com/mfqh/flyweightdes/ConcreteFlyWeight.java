package com.mfqh.flyweightdes;
/**
 * 具体享元类
 * @author 81493
 *
 */

public class ConcreteFlyWeight implements FlyWeight{

	private String color;
		
	public ConcreteFlyWeight() {}

	public ConcreteFlyWeight(String color) {
		this.color =color;
	}

	public String getColor() {
		return this.color;		
	}

	@Override
	public void display(UnsharedConcreteFlyWeight ucWeight) {

		System.out.print("属性：\t颜色"+this.color);
		System.out.println("\t位置：x->"+ucWeight.getX()+"  y->"+ucWeight.getY());
		
	}

}

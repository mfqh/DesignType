package com.mfqh.flyweightdes;
/**
 *非共享享元类
 * @author 81493
 *
 */

public class UnsharedConcreteFlyWeight {

	private int x;
	private int y;
	
	public UnsharedConcreteFlyWeight() {}
	
	public UnsharedConcreteFlyWeight(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
		
}

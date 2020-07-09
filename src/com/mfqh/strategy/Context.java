package com.mfqh.strategy;
/**
 * 负责和策略模式进行交互
 * 可通过反射动态的创建相关策略
 * @author 81493
 *
 */

public class Context {
	
	private Strategy myStrategy;
	private int original;
	
	public Context() {};

	public Context(Strategy myStrategy,int original) {
		super();
		this.myStrategy = myStrategy;
		this.original = original;
	}

	public void setMyStrategy(Strategy myStrategy) {
		this.myStrategy = myStrategy;
	}
	
	public int getOriginal() {
		return original;
	}

	public void setOriginal(int original) {
		this.original = original;
	}

	public void conAction() {
		double after = myStrategy.transFormation(this.original);
		System.out.println("后续规格"+after);
	}

}

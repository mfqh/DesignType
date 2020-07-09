package com.mfqh.strategy;
/**
 * 具体策略A
 * @author 81493
 *
 */

public class StrategyA implements Strategy{


	public double transFormation(double number) {
		System.out.println("执行策略A");
		return number*100;
	}

	
}

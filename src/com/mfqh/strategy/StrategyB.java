package com.mfqh.strategy;
/**
 * 具体策略B
 * @author 81493
 *
 */

public class StrategyB implements Strategy{

	@Override
	public double transFormation(double number) {
		System.out.println("执行策略B");
		return number/10;
	}

}

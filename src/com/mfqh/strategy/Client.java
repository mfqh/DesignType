package com.mfqh.strategy;
/**
 * 测试策略模式
 * @author 81493
 *
 */

public class Client {

	public static void main(String[] args) {
		Strategy myStrategy = new StrategyB();       //不用反射直接定义
		
		System.out.println("起始指标为"+100);
		Context myContext = new Context(myStrategy,100);
		myContext.conAction();
	}
}

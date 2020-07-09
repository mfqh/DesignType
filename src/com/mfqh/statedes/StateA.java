package com.mfqh.statedes;
/**
 * 具体状态类：
 * 在内部会自动进行状态的切换
 * @author 81493
 *
 */

public class StateA implements State{

	@Override
	public State handler() {

		System.out.println("执行A操作");
		
		System.out.println("状态切换");
		return new StateB();
		
	}

}

package com.mfqh.statedes;

public class StateB implements State{

	@Override
	public State handler() {

		System.out.println("执行B操作");
		
		System.out.println("状态切换");
		return new StateC();
		
	}

}

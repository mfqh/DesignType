package com.mfqh.statedes;

public class StateC implements State{

	@Override
	public State handler() {
		System.out.println("执行C操作");

		System.out.println("状态切换");
		return new StateA();
		
	}

}

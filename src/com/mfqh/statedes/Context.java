package com.mfqh.statedes;
/**
 * 环境类,持有状态对象
 * @author 81493
 *
 */

public class Context {

	private State state;

	public Context() {}
	
	public Context(State state) {
		super();
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	//状态执行/切换
	public void request() {
		
		this.state = state.handler();
	}
	
	
	
}

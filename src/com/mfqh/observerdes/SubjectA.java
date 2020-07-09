package com.mfqh.observerdes;
/**
 * 具体目标对象
 * @author 81493
 *
 */

public class SubjectA extends Subject{

	//表状态
	private int state;
	
	public SubjectA() {}

	public SubjectA(int state) {
		super();
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void tranState(int state) {
		this.state = state;
		//进行通知
		this.notifyAllObserver();
	}
	
	
	
}

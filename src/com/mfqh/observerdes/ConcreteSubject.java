package com.mfqh.observerdes;

import java.util.Observable;
/**
 * 使用现有接口
 * @author 81493
 *
 */
public class ConcreteSubject extends Observable{

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		
		setChanged();           //表状态以改变
		notifyObservers(state);            //通知所有观察者
	}
	
	
}
